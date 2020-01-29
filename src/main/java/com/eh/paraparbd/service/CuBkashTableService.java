package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.CuBkashTable;
import com.eh.paraparbd.entity.RentACarBooking;

public interface CuBkashTableService {

    List<CuBkashTable> findCuBkashTable();
    CuBkashTable findById();
    List<RentACarBooking> findPendingBooking(int userId);
    List<RentACarBooking> findConfirmBooking(int userId);
}
