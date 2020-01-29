package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.CuSmsTable;

public interface CuSmsTableService {

    public List<CuSmsTable> findCuSmsTable();
    public CuSmsTable findById();
    public CuSmsTable findByRandomGenaratedCode(String randomGenaratedCode);
}
