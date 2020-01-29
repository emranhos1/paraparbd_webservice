package com.eh.paraparbd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.paraparbd.entity.CommonUser;
import com.eh.paraparbd.entity.CuSmsTable;
import com.eh.paraparbd.entity.DwpOwner;
import com.eh.paraparbd.entity.LoginTable;
import com.eh.paraparbd.entity.RentACarOwner;
import com.eh.paraparbd.pojo.RegitrationPojo;
import com.eh.paraparbd.service.CommonUserService;
import com.eh.paraparbd.service.CuSmsTableService;
import com.eh.paraparbd.service.DwpOwnerService;
import com.eh.paraparbd.service.LoginTableService;
import com.eh.paraparbd.service.RentACarOwnerService;

/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 2.0.0.00
 * +880670932273;+8801670932273;
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    CommonUserService commonUserService;

    @Autowired
    LoginTableService loginTableService;

    @Autowired
    RentACarOwnerService rentACarOwnerService;

    @Autowired
    DwpOwnerService dwpOwnerService;
    
    @Autowired
    CuSmsTableService cuSmsTableService;

    @PostMapping("/common-user/registration")
    public Map<String, Object> commonUserRegistration(@RequestBody RegitrationPojo userRegPojo) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();

        CuSmsTable hasRandomCode = cuSmsTableService.findByRandomGenaratedCode(userRegPojo.getRandomCode());
        if(hasRandomCode != null){

            LoginTable hasPhoneNo = loginTableService.findByPhoneNo(userRegPojo.getPhoneNo());
            if (hasPhoneNo == null) {
                response = commonUserService.insert(userRegPojo);
            } else {
                response.put("data", null);
                response.put("success", false);
                response.put("message", "Mobile no already exiest! Please Try another one");
            }
        } else {
            response.put("data", null);
            response.put("success", false);
            response.put("message", "Code does not match! Please Try again");
        }
        return response;
    }

    @PostMapping("/rent-a-car-owner/registration")
    public Map<String, Object> rentACarOwnerRegistration(@RequestBody RegitrationPojo rentACarRegPojo) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        LoginTable hasPhoneNo = loginTableService.findByPhoneNo(rentACarRegPojo.getPhoneNo());
        if (hasPhoneNo == null) {
            response = rentACarOwnerService.insert(rentACarRegPojo);
        } else {
            response.put("data", null);
            response.put("success", false);
            response.put("message", "Mobile no already exiest! Please Try another one");
        }
        return response; 
    }

    @PostMapping("/dwp-owner/registration")
    public Map<String, Object> dwpOwnerRegistration(@RequestBody RegitrationPojo dwpOwnerRegPojo) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        LoginTable hasPhoneNo = loginTableService.findByPhoneNo(dwpOwnerRegPojo.getPhoneNo());
        if (hasPhoneNo == null) {
            response = dwpOwnerService.insert(dwpOwnerRegPojo);
        } else {
            response.put("data", null);
            response.put("success", false);
            response.put("message", "Mobile no already exiest! Please Try another one");
        }
        return response; 
    }

    @GetMapping("/all-common-user")
    public Map<String, Object> allCommonUser() throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        List<CommonUser> commonUser = commonUserService.findAllCommonUser();
        int total = commonUser.size();

        response.put("total", total);
        response.put("data", commonUser);
        response.put("success", CollectionUtils.isEmpty(commonUser) ? false : true);
        response.put("message", CollectionUtils.isEmpty(commonUser) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/all-rent-a-car-owner")
    public Map<String, Object> allRentACarOwner() throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        List<RentACarOwner> rentACarOwner = rentACarOwnerService.findAllRentACarOwner();
        int total = rentACarOwner.size();

        response.put("total", total);
        response.put("data", rentACarOwner);
        response.put("success", CollectionUtils.isEmpty(rentACarOwner) ? false : true);
        response.put("message", CollectionUtils.isEmpty(rentACarOwner) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/all-dwp-owner")
    public Map<String, Object> allDwpOwner() throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        List<DwpOwner> dwpCarOwner = dwpOwnerService.findAllDwpOwner();
        int total = dwpCarOwner.size();
        
        response.put("total", total);
        response.put("data", dwpCarOwner);
        response.put("success", CollectionUtils.isEmpty(dwpCarOwner) ? false : true);
        response.put("message", CollectionUtils.isEmpty(dwpCarOwner) ? "No Record Found" : "Records Found");
        return response;
    }
}
