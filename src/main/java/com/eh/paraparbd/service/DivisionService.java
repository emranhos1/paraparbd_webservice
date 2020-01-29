package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.Division;

public interface DivisionService {

    public List<Division> findAllDivision();
    Division findById(int code);
}
