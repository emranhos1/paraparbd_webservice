package com.eh.paraparbd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.RentACarBooking;
import com.eh.paraparbd.entity.RentACarTable;
import com.eh.paraparbd.service.AllUserService;
import com.eh.paraparbd.service.RentACarBookingService;
import com.eh.paraparbd.service.RentACarTableService;

/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 2.0.0.00
 * +880670932273;+8801670932273;
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    RentACarTableService rentACarTableService;

    @Autowired
    AllUserService allUserService;

    @Autowired
    RentACarBookingService rentACarBookingService;

    @GetMapping("/get-active-car")
    public Map<String, Object> allActiveCar() throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        //FIXME Query
        String Query;
        List<RentACarTable> activeCar = rentACarTableService.findAllActiveCar();
        if(!CollectionUtils.isEmpty(activeCar)) {
            int total = activeCar.size();
            response.put("total", total);
            response.put("data", activeCar);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("total", 0);
            response.put("data", null);
            response.put("success", false);
            response.put("message", "No Records Found");
        }

        return response;
    }

    @GetMapping("/get-inactive-car")
    public Map<String, Object> allInactiveCar() throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        //FIXME Query
        String Query;
        List<RentACarTable> inActiveCar = rentACarTableService.findAllInActiveCar();
        if(!CollectionUtils.isEmpty(inActiveCar)) {
            int total = inActiveCar.size();
            response.put("total", total);
            response.put("data", inActiveCar);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("total", 0);
            response.put("data", null);
            response.put("success", false);
            response.put("message", "No Records Found");
        }

        return response;
    }

    @PostMapping("/car-activation/{rentACarTableId}")
    public Map<String, Object> carActivation(@PathVariable("rentACarTableId") int rentACarTableId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
        boolean isActive = rentACarTableService.activeCar(rentACarTableId);

        if(isActive){
            response.put("total", 1);
            response.put("success", true);
            response.put("message", "Car Activation Successful");
        } else {
            response.put("total", 0);
            response.put("success", false);
            response.put("message", "Car Activation Unsuccessful");
        }

        return response;
    }

    @PostMapping("/car-inactivation/{rentACarTableId}")
    public Map<String, Object> carInActivation(@PathVariable("rentACarTableId") int rentACarTableId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
        boolean isInActive = rentACarTableService.inActiveCar(rentACarTableId);

        if(isInActive){
            response.put("total", 1);
            response.put("success", true);
            response.put("message", "Car Inactivation Successful");
        } else {
            response.put("total", 0);
            response.put("success", false);
            response.put("message", "Car Inactivation Unsuccessful");
        }

        return response;
    }

    @GetMapping("/get-active-rent-a-car")
    public Map<String, Object> allActiveRentACar() throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        //FIXME Query
        String Query;
        List<AllUser> activeRantACar = rentACarTableService.findAllActiveRentACar();
        if(!CollectionUtils.isEmpty(activeRantACar)) {
            int total = activeRantACar.size();
            response.put("total", total);
            response.put("data", activeRantACar);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("total", 0);
            response.put("data", null);
            response.put("success", false);
            response.put("message", "No Records Found");
        }
        return response;
    }

    @GetMapping("/get-inactive-rent-a-car")//FIXME\
    public Map<String, Object> allInActiveRentACar() throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        //FIXME Query
        String Query;
        List<AllUser> inactiveRantACar = rentACarTableService.findAllInactiveRentACar();
        if(!CollectionUtils.isEmpty(inactiveRantACar)) {
            int total = inactiveRantACar.size();
            response.put("total", total);
            response.put("data", inactiveRantACar);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("total", 0);
            response.put("data", null);
            response.put("success", false);
            response.put("message", "No Records Found");
        }
        return response;
    }

    @PostMapping("/rent-a-car/activation/{allUserId}")//FIXME\
    public Map<String, Object> rentACarActivation(@PathVariable("allUserId") int allUserId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
        allUserService.activatingRentACar(allUserId);

        response.put("total", 1);
        response.put("success", true);
        response.put("message", "Car Activation Successful");
        return response;
    }

    @PostMapping("/rent-a-car/inactivation/{allUserId}")
    public Map<String, Object> rentACarInactivation(@PathVariable("allUserId") int allUserId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
        allUserService.inActivatingRentACar(allUserId);

        response.put("total", 1);
        response.put("success", true);
        response.put("message", "Car Inactivation Successful");
        return response;
    }

    @GetMapping("/get-authorized-request")//FIXME\
    public Map<String, Object> allAuthorizedRequest() throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        //FIXME Query
        String Query;
        List<RentACarBooking> authorizedRequest = rentACarBookingService.findAllAuthorizedRequest();
        if(!CollectionUtils.isEmpty(authorizedRequest)) {
            int total = authorizedRequest.size();
            response.put("total", total);
            response.put("data", authorizedRequest);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("total", 0);
            response.put("data", null);
            response.put("success", false);
            response.put("message", "No Records Found");
        }
        return response;
    }

    @GetMapping("/all-user-booking-request")//FIXME\
    public Map<String, Object> allBookingRequest() throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        //FIXME Query
        String Query;
        List<RentACarBooking> bookingRequest = rentACarBookingService.findAllBookingRequest();
        if(!CollectionUtils.isEmpty(bookingRequest)) {
            int total = bookingRequest.size();
            response.put("total", total);
            response.put("data", bookingRequest);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("total", 0);
            response.put("data", null);
            response.put("success", false);
            response.put("message", "No Records Found");
        }
        return response;
    }

    @PostMapping("/comon-user/confirm-request")
    public Map<String, Object> confirmRequest(@RequestBody RentACarBooking rentACarBooking) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
         boolean isBookingUpdated = rentACarBookingService.updateRentACarBooking(rentACarBooking);

         if(isBookingUpdated){
             response.put("total", 1);
             response.put("success", true);
             response.put("message", "Rent-E-Car Assign Successful For Booking");
         } else {
             response.put("total", 0);
             response.put("data", null);
             response.put("success", false);
             response.put("message", "Rent-E-Car Assign Unsuccessful For Booking");
         }

         return response;
    }
}
