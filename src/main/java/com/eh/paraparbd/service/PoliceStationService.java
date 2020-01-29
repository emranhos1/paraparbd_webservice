package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.PoliceStation;

public interface PoliceStationService {

    public List<PoliceStation> findAllPoliceStation();
    PoliceStation findById(int code);
}
