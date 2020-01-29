package com.eh.paraparbd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.CommonUser;
import com.eh.paraparbd.entity.DwpOwner;
import com.eh.paraparbd.entity.RentACarOwner;
import com.eh.paraparbd.service.AllUserService;
import com.eh.paraparbd.service.CommonUserService;
import com.eh.paraparbd.service.DwpOwnerService;
import com.eh.paraparbd.service.RentACarOwnerService;

/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 2.0.0.00
 * +880670932273;+8801670932273;
 */
@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    AllUserService allUserService;

    @Autowired
    CommonUserService commonUserService;

    @Autowired
    RentACarOwnerService rentACarOwnerService;

    @Autowired
    DwpOwnerService dwpOwnerService;

    @GetMapping("/common-user/{allUserId}")
    public Map<String, Object> commonUserProfile(@PathVariable("allUserId") int allUserId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
        AllUser commonUserDetails = allUserService.findByAllUserId(allUserId);
        int commonUserId = commonUserDetails.getUserId();
        CommonUser userDetails = commonUserService.findByCommonUserId(commonUserId);

        response.put("data", userDetails);
        response.put("total", ObjectUtils.isEmpty(userDetails) ? 0 : 1);
        response.put("success", ObjectUtils.isEmpty(userDetails) ? false : true);
        response.put("message", ObjectUtils.isEmpty(userDetails) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/rent-a-car-owner/{allUserId}")
    public Map<String, Object> rentECarOwnerProfile(@PathVariable("allUserId") int allUserId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
        AllUser rentACarDetails = allUserService.findByAllUserId(allUserId);
        int rentACarOwnerId = rentACarDetails.getUserId();
        RentACarOwner userDetails = rentACarOwnerService.findByRentACarOwnerId(rentACarOwnerId);

        response.put("data", userDetails);
        response.put("total", ObjectUtils.isEmpty(userDetails) ? 0 : 1);
        response.put("success", ObjectUtils.isEmpty(userDetails) ? false : true);
        response.put("message", ObjectUtils.isEmpty(userDetails) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/dwp-owner/{allUserId}")
    public Map<String, Object> dwpOwnerProfile(@PathVariable("allUserId") int allUserId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
        AllUser dwpDetails = allUserService.findByAllUserId(allUserId);
        int dwpOwnerId = dwpDetails.getUserId();
        DwpOwner userDetails = dwpOwnerService.findByDwpOwnerId(dwpOwnerId);

        response.put("data", userDetails);
        response.put("total", ObjectUtils.isEmpty(userDetails) ? 0 : 1);
        response.put("success", ObjectUtils.isEmpty(userDetails) ? false : true);
        response.put("message", ObjectUtils.isEmpty(userDetails) ? "No Record Found" : "Records Found");
        return response;
    }
}
