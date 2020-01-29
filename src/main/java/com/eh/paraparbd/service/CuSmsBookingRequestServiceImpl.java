package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.CuSmsBookingRequest;
import com.eh.paraparbd.repository.CuSmsBookingRequestRepository;

@Service
public class CuSmsBookingRequestServiceImpl implements CuSmsBookingRequestService{

    @Autowired
    CuSmsBookingRequestRepository cuSmsBookingRequestRepository;
    
    @Override
    public List<CuSmsBookingRequest> findCuSmsBookingRequestTable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CuSmsBookingRequest findById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CuSmsBookingRequest insert(CuSmsBookingRequest bookingRequest) {
        return cuSmsBookingRequestRepository.save(bookingRequest);
    }
}
