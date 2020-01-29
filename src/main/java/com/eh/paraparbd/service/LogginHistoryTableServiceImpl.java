package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eh.paraparbd.entity.LogginHistoryTable;
import com.eh.paraparbd.repository.LogginHistoryTableRepository;

public class LogginHistoryTableServiceImpl implements LogginHistoryTableService{

    @Autowired
    LogginHistoryTableRepository repository;
    
    @Override
    public List<LogginHistoryTable> findLogginHistoryTable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LogginHistoryTable findById() {
        // TODO Auto-generated method stub
        return null;
    }


}
