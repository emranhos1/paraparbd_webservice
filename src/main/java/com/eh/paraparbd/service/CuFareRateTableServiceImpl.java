package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eh.paraparbd.entity.CuFareRateTable;
import com.eh.paraparbd.repository.CuFareRateTableRepository;

public class CuFareRateTableServiceImpl implements CuFareRateTableService{

    @Autowired
    CuFareRateTableRepository repository;
    
    @Override
    public List<CuFareRateTable> findCuFareRateTable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CuFareRateTable findById() {
        // TODO Auto-generated method stub
        return null;
    }


}
