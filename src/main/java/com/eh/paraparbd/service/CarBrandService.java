package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.CarBrand;

public interface CarBrandService {

    public List<CarBrand> findAllCarBrand();
    CarBrand findById(int code);
}
