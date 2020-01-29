package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.CarCategory;
import com.eh.paraparbd.repository.CarCategoryRepository;

@Service
public class CarCategoryServiceImpl implements CarCategoryService{

    @Autowired
    CarCategoryRepository carCategoryRepository;
    
    @Override
    public List<CarCategory> findCarCategory() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CarCategory findById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CarCategory findByRegiNo(String newCarRegNo) {
        return carCategoryRepository.findByCarRegiNo(newCarRegNo);
    }

    @Override
    public CarCategory insert(CarCategory carCategory) {
        return carCategoryRepository.save(carCategory);
    }

    @Override
    public List<CarCategory> findByRentACarOwnerId(int rentACarOwnerId) {
        return carCategoryRepository.findByRentACarOwnerId(rentACarOwnerId);
    }
}
