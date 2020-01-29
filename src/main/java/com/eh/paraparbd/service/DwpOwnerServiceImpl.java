package com.eh.paraparbd.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.DwpOwner;
import com.eh.paraparbd.entity.LoginTable;
import com.eh.paraparbd.entity.RentACarBooking;
import com.eh.paraparbd.pojo.RegitrationPojo;
import com.eh.paraparbd.repository.AllUserRepository;
import com.eh.paraparbd.repository.DwpOwnerRepository;
import com.eh.paraparbd.repository.LoginTableRepository;
import com.eh.paraparbd.repository.RentACarBookingRepository;

@Service
public class DwpOwnerServiceImpl implements DwpOwnerService{

    @Autowired
    DwpOwnerRepository dwpOwnerRepository;

    @Autowired
    AllUserRepository allUserRepository;

    @Autowired
    LoginTableRepository loginTableRepository;

    @Autowired
    RentACarBookingRepository rentACarBookingRepository;

    @Autowired
    AllUserService allUserService;

    @Autowired
    DwpOwnerService dwpOwnerService;

    @Override
    public List<DwpOwner> findAllDwpOwner() {
        return dwpOwnerRepository.findAll();
    }

    @Override
    public DwpOwner findByDwpOwnerId(int dwpOwnerId) {
        return dwpOwnerRepository.findByDwpOwnerId(dwpOwnerId);
    }

    @Override
    public DwpOwner findByPhoneNo(String phoneNo) {
        return dwpOwnerRepository.findByPhoneNo(phoneNo);
    }

    @Override
    public Map<String, Object> insert(RegitrationPojo dwpRegPojo) {
        Map<String, Object> response = new HashMap<String, Object>();
        DwpOwner dwpOwner = new DwpOwner();
        AllUser allUser = new AllUser();
        LoginTable loginTable = new LoginTable();
        RegitrationPojo responseData = new RegitrationPojo();
        Date currentDate = new Date();

        dwpOwner.setFirstName(dwpRegPojo.getFirstName());
        dwpOwner.setLastName(dwpRegPojo.getLastName());
        dwpOwner.setEmail(dwpRegPojo.getEmail());
        dwpOwner.setPhoneNo(dwpRegPojo.getPhoneNo());
        dwpOwner.setDivisionId(dwpRegPojo.getDivisionId());
        dwpOwner.setDistrictId(dwpRegPojo.getDistrictId());
        dwpOwner.setPoliceStationId(dwpRegPojo.getPoliceStationId());
        dwpOwner.setAddress(dwpRegPojo.getAddress());
        dwpOwner.setGender(dwpRegPojo.getGender());
        dwpOwner.setZipCode(dwpRegPojo.getZipCode());
        dwpOwner.setOwnerPhoto(dwpRegPojo.getOwnerPhoto());
        dwpOwner.setNidNo(dwpRegPojo.getNidNo());
        dwpOwner.setNidScanCopy(dwpRegPojo.getNidScanCopy());
        dwpOwner.setTinNo(dwpRegPojo.getTinNo());
        dwpOwner.setTinScanCopy(dwpRegPojo.getTinScanCopy());
        dwpOwner.setTradeLisenceNo(dwpRegPojo.getTradeLisenceNo());
        dwpOwner.setTradeLisenceScanCopy(dwpRegPojo.getTradesScanCopy());
        dwpOwner.setRegistrationDate(currentDate);

        //insert DWPOwner
        DwpOwner dwpOwnerResponse = dwpOwnerRepository.save(dwpOwner);
        if(dwpOwnerResponse != null){
            String userRole = "DWP";
            int activeStatus = 1;

            allUser.setUserId(dwpOwnerResponse.getDwpOwnerId());
            allUser.setUserRole(userRole);
            allUser.setActiveDate(currentDate);
            allUser.setActiveStatus(activeStatus);

            //insert allUser
            AllUser allUserResponce = allUserRepository.save(allUser);
            if(allUserResponce != null) {
                loginTable.setAllUserId(allUserResponce.getAllUserId());
                loginTable.setPassword(dwpRegPojo.getPassword());
                loginTable.setPhoneNo(dwpRegPojo.getPhoneNo());

                //insert loginTable
                LoginTable loginTableResponce = loginTableRepository.save(loginTable);
                if(loginTableResponce !=null) {
                    responseData.setFirstName(dwpOwnerResponse.getFirstName());
                    responseData.setLastName(dwpOwnerResponse.getLastName());
                    responseData.setGender(dwpOwnerResponse.getGender());
                    responseData.setEmail(dwpOwnerResponse.getEmail());
                    responseData.setPhoneNo(dwpOwnerResponse.getPhoneNo());
                    responseData.setDivisionId(dwpOwnerResponse.getDivisionId());
                    responseData.setDistrictId(dwpOwnerResponse.getDistrictId());
                    responseData.setPoliceStationId(dwpOwnerResponse.getPoliceStationId());
                    responseData.setAddress(dwpOwnerResponse.getAddress());
                    responseData.setZipCode(dwpOwnerResponse.getZipCode());
                    responseData.setOwnerPhoto(dwpOwnerResponse.getOwnerPhoto());
                    responseData.setNidNo(dwpOwnerResponse.getNidNo());
                    responseData.setNidScanCopy(dwpOwnerResponse.getNidScanCopy());
                    responseData.setTinNo(dwpOwnerResponse.getTinNo());
                    responseData.setTinScanCopy(dwpOwnerResponse.getTinScanCopy());
                    responseData.setTradeLisenceNo(dwpOwnerResponse.getTradeLisenceNo());
                    responseData.setTradesScanCopy(dwpOwnerResponse.getTradeLisenceScanCopy());

                    response.put("data", responseData);
                    response.put("success", true);
                    response.put("message", "DWP Owner Registration Sccessufully!");
                } else {
                    response.put("success", false);
                    response.put("message", "DWP Owner Registration Unsccessufully!");
                }
            } else {
                response.put("success", false);
                response.put("message", "All User Table Insert Unsuccessful!");
            }
        } else {
            response.put("success", false);
            response.put("message", "DWP Owner Table Insert Unsuccessful!");
        }

        return response;
    }

    @Override
    public List<RentACarBooking> findCurrentMonthRentForDwp(int allUserId) {
        List<RentACarBooking> response = new ArrayList<RentACarBooking>();

        AllUser dwpOwner = allUserService.findByAllUserId(allUserId);
        int userId = dwpOwner.getUserId();

        DwpOwner dwpOwnerdetails = dwpOwnerRepository.findById(userId).get();
        int dwpOwnerDistId = dwpOwnerdetails.getDistrictId();
        int currentMonth = Calendar.getInstance().get(Calendar.ERA);

        response = rentACarBookingRepository.findByTravelMonthAndOriginDistrictId(dwpOwnerDistId, currentMonth);

        return response;
    }
}
