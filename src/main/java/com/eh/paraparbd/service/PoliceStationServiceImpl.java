package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.PoliceStation;
import com.eh.paraparbd.repository.PoliceStationRepository;

@Service
public class PoliceStationServiceImpl implements PoliceStationService{

    @Autowired
    PoliceStationRepository policeStationRepository;
    
    @Override
    public List<PoliceStation> findAllPoliceStation() {
        return policeStationRepository.findAll();
    }

    @Override
    public PoliceStation findById(int code) {
        return policeStationRepository.findById(code).get();
    }
}
