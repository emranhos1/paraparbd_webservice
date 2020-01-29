package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.CuBkashTable;
import com.eh.paraparbd.entity.RentACarBooking;
import com.eh.paraparbd.repository.CuBkashTableRepository;

@Service
public class CuBkashTableServiceImpl implements CuBkashTableService{

    @Autowired
    CuBkashTableRepository cuBkashTableRepository;
    
    @Override
    public List<CuBkashTable> findCuBkashTable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CuBkashTable findById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<RentACarBooking> findPendingBooking(int userId) {
        return cuBkashTableRepository.findPendingBooking(userId);
    }

    @Override
    public List<RentACarBooking> findConfirmBooking(int userId) {
        return cuBkashTableRepository.findConfirmBooking(userId);
    }
}
