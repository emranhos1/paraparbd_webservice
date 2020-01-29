package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.CuFareRateTable;

public interface CuFareRateTableService {

    public List<CuFareRateTable> findCuFareRateTable();
    public CuFareRateTable findById();

}
