package com.eh.paraparbd.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.CommonUser;
import com.eh.paraparbd.entity.LoginTable;
import com.eh.paraparbd.pojo.RegitrationPojo;
import com.eh.paraparbd.repository.AllUserRepository;
import com.eh.paraparbd.repository.CommonUserRepository;
import com.eh.paraparbd.repository.LoginTableRepository;

@Service
public class CommonUserServiceImpl implements CommonUserService{

    @Autowired
    CommonUserRepository commonUserRepository;

    @Autowired
    AllUserRepository allUserRepository;

    @Autowired
    LoginTableRepository loginTableRepository;

    @Override
    public List<CommonUser> findAllCommonUser() {
        return commonUserRepository.findAll();
    }

    @Override
    public CommonUser findByCommonUserId(int commonUserId) {
        return commonUserRepository.findByCommonUserId(commonUserId);
    }

    @Override
    public Map<String, Object> insert(RegitrationPojo userRegPojo) {
        Map<String, Object> response = new HashMap<String, Object>();
        CommonUser commonUser = new CommonUser();
        AllUser allUser = new AllUser();
        LoginTable loginTable = new LoginTable();
        RegitrationPojo responseData = new RegitrationPojo();

        commonUser.setFirstName(userRegPojo.getFirstName());
        commonUser.setLastName(userRegPojo.getLastName());
        commonUser.setGender(userRegPojo.getGender());
        commonUser.setEmail(userRegPojo.getEmail());
        commonUser.setPhoneNo(userRegPojo.getPhoneNo());
        commonUser.setAddress(userRegPojo.getAddress());
        commonUser.setDeviceImeNo(userRegPojo.getDeviceImeNo());
        commonUser.setDeviceLocation(userRegPojo.getDeviceLocation());
        commonUser.setDeviceIp(userRegPojo.getDeviceIp());
        commonUser.setCreatedDate(new Date());

        //insert commonUser
        CommonUser commonUserResponce = commonUserRepository.save(commonUser);
        if(commonUserResponce != null) {

            String userRole = "CommonUser";
            int activeStatus = 1;

            allUser.setUserId(commonUserResponce.getCommonUserId());
            allUser.setUserRole(userRole);
            allUser.setActiveDate(new Date());
            allUser.setActiveStatus(activeStatus);

            //insert allUser
            AllUser allUserResponce = allUserRepository.save(allUser);
            if(allUserResponce != null) {

                loginTable.setAllUserId(allUserResponce.getAllUserId());
                loginTable.setPassword(userRegPojo.getPassword());
                loginTable.setPhoneNo(userRegPojo.getPhoneNo());

                //insert loginTable
                LoginTable loginTableResponce = loginTableRepository.save(loginTable);
                if(loginTableResponce !=null) {
                    responseData.setFirstName(commonUserResponce.getFirstName());
                    responseData.setLastName(commonUserResponce.getLastName());
                    responseData.setGender(commonUserResponce.getGender());
                    responseData.setEmail(commonUserResponce.getEmail());
                    responseData.setPhoneNo(commonUserResponce.getPhoneNo());
                    responseData.setOwnerPhoto(commonUserResponce.getPhoto());
                    responseData.setAddress(commonUserResponce.getAddress());
                    responseData.setDeviceImeNo(commonUserResponce.getDeviceImeNo());
                    responseData.setDeviceLocation(commonUserResponce.getDeviceLocation());
                    responseData.setDeviceIp(commonUserResponce.getDeviceIp());

                    response.put("data", responseData);
                    response.put("success", true);
                    response.put("message", "User Registration Sccessufully!");
                } else {
                    response.put("success", false);
                    response.put("message", "User Registration Unsccessufully!");
                }
            } else {
                response.put("success", false);
                response.put("message", "All User Table Insert Unsuccessful!");
            }
        } else {
            response.put("success", false);
            response.put("message", "Common User Table Insert Unsuccessful!");
        }

        return response;
    }

    @Override
    public CommonUser findByPhoneNo(String phoneNo) {
        return commonUserRepository.findByPhoneNo(phoneNo);
    }
}
