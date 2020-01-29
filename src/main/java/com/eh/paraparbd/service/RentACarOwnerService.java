package com.eh.paraparbd.service;

import java.util.List;
import java.util.Map;

import com.eh.paraparbd.entity.RentACarOwner;
import com.eh.paraparbd.pojo.RegitrationPojo;

public interface RentACarOwnerService {

    List<RentACarOwner> findAllRentACarOwner();
    List<RentACarOwner> findRentACarOwner();
    List<RentACarOwner> findByDistrictId(int dwpDistrictId);
    
    RentACarOwner findByRentACarOwnerId(int rentACarOwnerId);
    RentACarOwner findByPhoneNo(String phoneNo);
    
    Map<String, Object> insert(RegitrationPojo rentACarRegPojo);
}
