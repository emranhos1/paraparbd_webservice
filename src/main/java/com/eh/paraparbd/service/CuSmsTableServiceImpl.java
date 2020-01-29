package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.CuSmsTable;
import com.eh.paraparbd.repository.CuSmsTableRepository;

@Service
public class CuSmsTableServiceImpl implements CuSmsTableService{

    @Autowired
    CuSmsTableRepository cuSmsTableRepository;
    
    @Override
    public List<CuSmsTable> findCuSmsTable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CuSmsTable findById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CuSmsTable findByRandomGenaratedCode(String randomGenaratedCode) {
        return cuSmsTableRepository.findByRandomGenaratedCode(randomGenaratedCode);
    }
}
