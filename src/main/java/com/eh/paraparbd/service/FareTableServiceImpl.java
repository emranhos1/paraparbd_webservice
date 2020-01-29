package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eh.paraparbd.entity.FareTable;
import com.eh.paraparbd.repository.FareTableRepository;

public class FareTableServiceImpl implements FareTableService{

    @Autowired
    FareTableRepository repository;
    
    @Override
    public List<FareTable> findFareTable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FareTable findById() {
        // TODO Auto-generated method stub
        return null;
    }


}
