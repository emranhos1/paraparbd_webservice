package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.CarBrand;
import com.eh.paraparbd.repository.CarBrandRepository;

@Service
public class CarBrandServiceImpl implements CarBrandService{

    @Autowired
    CarBrandRepository carBrandRepository;
    
    @Override
    public List<CarBrand> findAllCarBrand() {
        return carBrandRepository.findAll();
    }

    @Override
    public CarBrand findById(int code) {
        return carBrandRepository.findById(code).get();
    }
}
