package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.CarModel;

public interface CarModelService {

    public List<CarModel> findAllCarModel();
    CarModel findById(int code);
}
