package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.CarDriver;

public interface CarDriverService {

    public List<CarDriver> findCarDriver();
    public CarDriver findById();

}
