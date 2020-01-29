package com.eh.paraparbd.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.LoginTable;
import com.eh.paraparbd.entity.RentACarOwner;
import com.eh.paraparbd.pojo.RegitrationPojo;
import com.eh.paraparbd.repository.AllUserRepository;
import com.eh.paraparbd.repository.LoginTableRepository;
import com.eh.paraparbd.repository.RentACarOwnerRepository;

@Service
public class RentACarOwnerServiceImpl implements RentACarOwnerService{

    @Autowired
    RentACarOwnerRepository rentACarOwnerRepository;
    
    @Autowired
    AllUserRepository allUserRepository;

    @Autowired
    LoginTableRepository loginTableRepository;
    
    @Override
    public List<RentACarOwner> findRentACarOwner() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RentACarOwner findByRentACarOwnerId(int rentACarOwnerId) {
        return rentACarOwnerRepository.findByRentACarOwnerId(rentACarOwnerId);
    }

    @Override
    public List<RentACarOwner> findAllRentACarOwner() {
        return rentACarOwnerRepository.findAll();
    }

    @Override
    public RentACarOwner findByPhoneNo(String phoneNo) {
        return rentACarOwnerRepository.findByPhoneNo(phoneNo);
    }

    @Override
    public Map<String, Object> insert(RegitrationPojo rentACarRegPojo) {
        Map<String, Object> response = new HashMap<String, Object>();
        RentACarOwner rentACarOwner = new RentACarOwner();
        AllUser allUser = new AllUser();
        LoginTable loginTable = new LoginTable();
        RegitrationPojo responseData = new RegitrationPojo();

        rentACarOwner.setFirstName(rentACarRegPojo.getFirstName());
        rentACarOwner.setLastName(rentACarRegPojo.getLastName());
        rentACarOwner.setGender(rentACarRegPojo.getGender());
        rentACarOwner.setEmail(rentACarRegPojo.getEmail());
        rentACarOwner.setPhoneNo(rentACarRegPojo.getPhoneNo());
        rentACarOwner.setAddress(rentACarRegPojo.getAddress());
        rentACarOwner.setOwnerPhoto(rentACarRegPojo.getOwnerPhoto());
        rentACarOwner.setNidScanCopy(rentACarRegPojo.getNidScanCopy());
        rentACarOwner.setTinScanCopy(rentACarRegPojo.getTinScanCopy());
        rentACarOwner.setTradesScanCopy(rentACarRegPojo.getTradesScanCopy());
        rentACarOwner.setDivisionId(rentACarRegPojo.getDivisionId());
        rentACarOwner.setDistrictId(rentACarRegPojo.getDistrictId());
        rentACarOwner.setPoliceStationId(rentACarRegPojo.getPoliceStationId());
        rentACarOwner.setZipCode(rentACarRegPojo.getZipCode());
        rentACarOwner.setNidNo(rentACarRegPojo.getNidNo());
        rentACarOwner.setTinNo(rentACarRegPojo.getTinNo());
        rentACarOwner.setTradeLisenceNo(rentACarRegPojo.getTradeLisenceNo());
        rentACarOwner.setRentDeviceEmiNo(rentACarRegPojo.getIp());

        //insert RentACarOwner
        RentACarOwner rentACarOwnerResponse = rentACarOwnerRepository.save(rentACarOwner);
        if(rentACarOwnerResponse != null){
            String userRole = "RentACar";
            int activeStatus = 0;

            allUser.setUserId(rentACarOwnerResponse.getRentACarOwnerId());
            allUser.setUserRole(userRole);
            allUser.setActiveDate(new Date());
            allUser.setActiveStatus(activeStatus);

            //insert allUser
            AllUser allUserResponce = allUserRepository.save(allUser);
            if(allUserResponce != null) {
                loginTable.setAllUserId(allUserResponce.getAllUserId());
                loginTable.setPassword(rentACarRegPojo.getPassword());
                loginTable.setPhoneNo(rentACarRegPojo.getPhoneNo());

                //insert loginTable
                LoginTable loginTableResponce = loginTableRepository.save(loginTable);
                if(loginTableResponce !=null) {
                    responseData.setFirstName(rentACarOwnerResponse.getFirstName());
                    responseData.setLastName(rentACarOwnerResponse.getLastName());
                    responseData.setGender(rentACarOwnerResponse.getGender());
                    responseData.setEmail(rentACarOwnerResponse.getEmail());
                    responseData.setPhoneNo(rentACarOwnerResponse.getPhoneNo());
                    responseData.setDivisionId(rentACarOwnerResponse.getDivisionId());
                    responseData.setDistrictId(rentACarOwnerResponse.getDistrictId());
                    responseData.setPoliceStationId(rentACarOwnerResponse.getPoliceStationId());
                    responseData.setAddress(rentACarOwnerResponse.getAddress());
                    responseData.setZipCode(rentACarOwnerResponse.getZipCode());
                    responseData.setOwnerPhoto(rentACarOwnerResponse.getOwnerPhoto());
                    responseData.setNidNo(rentACarOwnerResponse.getNidNo());
                    responseData.setNidScanCopy(rentACarOwnerResponse.getNidScanCopy());
                    responseData.setTinNo(rentACarOwnerResponse.getTinNo());
                    responseData.setTinScanCopy(rentACarOwnerResponse.getTinScanCopy());
                    responseData.setTradeLisenceNo(rentACarOwnerResponse.getTradeLisenceNo());
                    responseData.setTradesScanCopy(rentACarOwnerResponse.getTradesScanCopy());
                    responseData.setRentDeviceEmiNo(rentACarOwnerResponse.getRentDeviceEmiNo());

                    response.put("data", responseData);
                    response.put("success", true);
                    response.put("message", "Rent A Car Owner Registration Sccessufully! Please Wait Untill Active ur Registration!");
                } else {
                    response.put("success", false);
                    response.put("message", "Rent A Car Owner Registration Unsccessufully!");
                }
            } else {
                response.put("success", false);
                response.put("message", "All User Table Insert Unsuccessful!");
            }
        } else {
            response.put("success", false);
            response.put("message", "Rent A Car Owner Table Insert Unsuccessful!");
        }
        return response;
    }

    @Override
    public List<RentACarOwner> findByDistrictId(int dwpDistrictId) {
        return rentACarOwnerRepository.findByDistrictId(dwpDistrictId);
    }
}
