package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.RentACarBooking;

public interface RentACarBookingService {

    List<RentACarBooking> getHistory(int userId);
    List<RentACarBooking> getCurentMonthRentForDwp(RentACarBooking rentACarBooking);
    List<RentACarBooking> getCurentMonthRentForRentACar(RentACarBooking rentACarBooking);
    List<RentACarBooking> findByRentACarOwnerId(int rentACarOwnerId);
    List<RentACarBooking> findAllAuthorizedRequest();
    List<RentACarBooking> findAllBookingRequest();

    RentACarBooking findById(int rentACarBookingTableId);
    Integer getMaxOrderNumber();
    
    RentACarBooking insert(RentACarBooking rentACarBooking);
    boolean updateRentACarBooking(RentACarBooking rentACarBooking);
}
