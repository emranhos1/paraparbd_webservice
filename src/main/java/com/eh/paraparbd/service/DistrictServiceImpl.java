package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.District;
import com.eh.paraparbd.repository.DistrictRepository;

@Service
public class DistrictServiceImpl implements DistrictService{

    @Autowired
    DistrictRepository districtRepository;
    
    @Override
    public List<District> findAllDistrict() {
        return districtRepository.findAll();
    }

    @Override
    public District findById(int code) {
        return districtRepository.findById(code).get();
    }
}
