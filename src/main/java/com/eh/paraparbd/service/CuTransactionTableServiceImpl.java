package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eh.paraparbd.entity.CuTransactionTable;
import com.eh.paraparbd.repository.CuTransactionTableRepository;

public class CuTransactionTableServiceImpl implements CuTransactionTableService{

    @Autowired
    CuTransactionTableRepository repository;
    
    @Override
    public List<CuTransactionTable> findCuTransactionTable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CuTransactionTable findById() {
        // TODO Auto-generated method stub
        return null;
    }


}
