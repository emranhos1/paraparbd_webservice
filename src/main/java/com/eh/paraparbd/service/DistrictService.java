package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.District;

public interface DistrictService {

    public List<District> findAllDistrict();
    District findById(int code);
}
