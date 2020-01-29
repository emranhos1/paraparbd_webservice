package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eh.paraparbd.entity.CarDriver;
import com.eh.paraparbd.repository.CarDriverRepository;

public class CarDriverServiceImpl implements CarDriverService{

    @Autowired
    CarDriverRepository repository;
    
    @Override
    public List<CarDriver> findCarDriver() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CarDriver findById() {
        // TODO Auto-generated method stub
        return null;
    }


}
