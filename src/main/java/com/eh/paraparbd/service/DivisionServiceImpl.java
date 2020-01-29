package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.Division;
import com.eh.paraparbd.repository.DivisionRepository;

@Service
public class DivisionServiceImpl implements DivisionService{

    @Autowired
    DivisionRepository divisionRepository;

    @Override
    public List<Division> findAllDivision() {
        return divisionRepository.findAll();
    }

    @Override
    public Division findById(int code) {
        return divisionRepository.findById(code).get();
    }
}
