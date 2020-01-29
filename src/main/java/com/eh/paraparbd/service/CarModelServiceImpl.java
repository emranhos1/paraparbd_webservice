package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.CarModel;
import com.eh.paraparbd.repository.CarModelRepository;

@Service
public class CarModelServiceImpl implements CarModelService{

    @Autowired
    CarModelRepository carModelRepository;
    
    @Override
    public List<CarModel> findAllCarModel() {
        return carModelRepository.findAll();
    }

    @Override
    public CarModel findById(int code) {
        return carModelRepository.findById(code).get();
    }
}
