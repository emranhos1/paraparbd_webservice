package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.CuSmsBookingRequest;

public interface CuSmsBookingRequestService {

    List<CuSmsBookingRequest> findCuSmsBookingRequestTable();
    CuSmsBookingRequest findById();
    CuSmsBookingRequest insert(CuSmsBookingRequest bookingRequest);
}
