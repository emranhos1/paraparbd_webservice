package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.CuTransactionTable;

public interface CuTransactionTableService {

    public List<CuTransactionTable> findCuTransactionTable();
    public CuTransactionTable findById();

}
