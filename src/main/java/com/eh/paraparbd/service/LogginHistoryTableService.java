package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.LogginHistoryTable;

public interface LogginHistoryTableService {

    public List<LogginHistoryTable> findLogginHistoryTable();
    public LogginHistoryTable findById();

}
