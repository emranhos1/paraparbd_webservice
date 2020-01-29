package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.CarCategory;

public interface CarCategoryService {

    List<CarCategory> findCarCategory();

    CarCategory findById();
    CarCategory findByRegiNo(String newCarRegNo);
    List<CarCategory> findByRentACarOwnerId(int rentACarOwnerId);

    CarCategory insert(CarCategory carCategory);
}
