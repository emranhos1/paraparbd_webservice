package com.eh.paraparbd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.LoginTable;
import com.eh.paraparbd.service.AllUserService;
import com.eh.paraparbd.service.LoginTableService;

/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 2.0.0.00
 * +880670932273;+8801670932273;
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginTableService loginTableService;

    @Autowired
    AllUserService allUserService;

    @PostMapping
    public Map<String, Object> userLogin(@RequestBody LoginTable loginTable) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();

        LoginTable loginDetails = loginTableService.findLoginUser(loginTable);
        if(!ObjectUtils.isEmpty(loginDetails)){
            int allUserid = loginDetails.getAllUserId();
            AllUser allUser = allUserService.findByAllUserId(allUserid);

            if(!ObjectUtils.isEmpty(allUser)) {
                if (allUser.getActiveStatus() != 0) {
                    response.put("data", allUser);
                    response.put("success", true);
                    response.put("message", "Login Successfull!");
                } else {
                    response.put("data", null);
                    response.put("success", false);
                    response.put("message", "You are not active yet!");
                }
            } else {
                response.put("data", null);
                response.put("success", false);
                response.put("message", "User Not Found!");
            }
        } else {
            response.put("data", null);
            response.put("success", false);
            response.put("message", "Mobile No or Password is incorrect!");
        }
        return response;
    }
}
