package com.eh.paraparbd.service;

import java.util.List;
import java.util.Map;

import com.eh.paraparbd.entity.DwpOwner;
import com.eh.paraparbd.entity.RentACarBooking;
import com.eh.paraparbd.pojo.RegitrationPojo;

public interface DwpOwnerService {

    List<DwpOwner> findAllDwpOwner();
    DwpOwner findByDwpOwnerId(int dwpOwnerId);
    DwpOwner findByPhoneNo(String phoneNo);

    Map<String, Object> insert(RegitrationPojo dwpRegPojo);
    List<RentACarBooking> findCurrentMonthRentForDwp(int allUserId);
}
