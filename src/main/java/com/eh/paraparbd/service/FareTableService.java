package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.FareTable;

public interface FareTableService {

    public List<FareTable> findFareTable();
    public FareTable findById();

}
