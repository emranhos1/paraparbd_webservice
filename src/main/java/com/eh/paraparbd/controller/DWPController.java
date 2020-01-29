package com.eh.paraparbd.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.DwpOwner;
import com.eh.paraparbd.entity.RentACarBooking;
import com.eh.paraparbd.entity.RentACarOwner;
import com.eh.paraparbd.service.AllUserService;
import com.eh.paraparbd.service.DwpOwnerService;
import com.eh.paraparbd.service.RentACarBookingService;
import com.eh.paraparbd.service.RentACarOwnerService;

/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 2.0.0.00
 * +880670932273;+8801670932273;
 */
@RestController
@RequestMapping("/dwp")
public class DWPController {

    @Autowired
    AllUserService allUserService;

    @Autowired
    DwpOwnerService dwpOwnerService;

    @Autowired
    RentACarBookingService rentACarBookingService;

    @Autowired
    RentACarOwnerService rentACarOwnerService;

    @GetMapping("/current-month-rent/{allUserId}")
    public Map<String, Object> dwpCorrentMonthRent(@PathVariable("allUserId") int allUserId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
        RentACarBooking rentACarBooking = new RentACarBooking();

        AllUser dwpOwnerDetails = allUserService.findByAllUserId(allUserId);
        int dwpOwnerId = dwpOwnerDetails.getUserId();

        DwpOwner userDetails = dwpOwnerService.findByDwpOwnerId(dwpOwnerId);
        int dwpDistrictId = userDetails.getDistrictId();
        int currentMonth = Calendar.getInstance().get(Calendar.ERA);

        rentACarBooking.setTravelMonth(currentMonth);
        rentACarBooking.setOriginDistrictId(dwpDistrictId);

        //FIXME need to join query
        int joinquery;
        List<RentACarBooking> getCurentMonthRent = rentACarBookingService.getCurentMonthRentForDwp(rentACarBooking);
        if (!CollectionUtils.isEmpty(getCurentMonthRent)) {
            int total = getCurentMonthRent.size();

            response.put("data", getCurentMonthRent);
            response.put("total", total);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("data", null);
            response.put("total", 0);
            response.put("success", false);
            response.put("message", "No Record Found");
        }

        return response;
    }

    @GetMapping("/under/all-car/{allUserId}")
    public Map<String, Object> dwpUnderAllCar(@PathVariable("allUserId") int allUserId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        AllUser dwpOwnerDetails = allUserService.findByAllUserId(allUserId);
        int dwpOwnerId = dwpOwnerDetails.getUserId();

        DwpOwner userDetails = dwpOwnerService.findByDwpOwnerId(dwpOwnerId);
        int dwpDistrictId = userDetails.getDistrictId();

        //FIXME Query
        String Query;
        List<RentACarOwner> allCarUnderDWP = rentACarOwnerService.findByDistrictId(dwpDistrictId);
        if (!CollectionUtils.isEmpty(allCarUnderDWP)) {
            int total = allCarUnderDWP.size();

            response.put("data", allCarUnderDWP);
            response.put("total", total);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("data", null);
            response.put("total", 0);
            response.put("success", false);
            response.put("message", "No Record Found");
        }

        return response;
    }
}
