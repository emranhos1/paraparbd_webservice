package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.RentACarBooking;
import com.eh.paraparbd.repository.RentACarBookingRepository;

@Service
public class RentACarBookingServiceImpl implements RentACarBookingService{

    @Autowired
    RentACarBookingRepository rentACarBookingRepository;
    
    @Override
    public List<RentACarBooking> getCurentMonthRentForDwp(RentACarBooking rentACarBooking) {
        int curentMonth = rentACarBooking.getTravelMonth();
        int districtId = rentACarBooking.getOriginDistrictId();
        return rentACarBookingRepository.getCurrentMonthRentForDwp(curentMonth, districtId);
    }

    @Override
    public RentACarBooking findById(int rentACarBookingTableId) {
        return rentACarBookingRepository.findById(rentACarBookingTableId).get();
    }

    @Override
    public Integer getMaxOrderNumber() {
        return rentACarBookingRepository.getMaxOrderNumber();
    }

    @Override
    public RentACarBooking insert(RentACarBooking rentACarBooking) {
        return rentACarBookingRepository.save(rentACarBooking);
    }

    @Override
    public List<RentACarBooking> findByRentACarOwnerId(int rentACarOwnerId) {
        return rentACarBookingRepository.findByRentACarOwnerId(rentACarOwnerId);
    }

    @Override
    public List<RentACarBooking> getCurentMonthRentForRentACar(RentACarBooking rentACarBooking) {
        int curentMonth = rentACarBooking.getTravelMonth();
        int rentACarOwnerId = rentACarBooking.getRentACarOwnerId();
        return rentACarBookingRepository.getCurrentMonthRentForRentACar(curentMonth, rentACarOwnerId);
    }

    @Override
    public List<RentACarBooking> getHistory(int userId) {
        return rentACarBookingRepository.getRentACarBookingCommonUserId(userId);
    }

    @Override
    public List<RentACarBooking> findAllAuthorizedRequest() {
        return rentACarBookingRepository.findAllAuthorizedRequest();
    }

    @Override
    public List<RentACarBooking> findAllBookingRequest() {
        return rentACarBookingRepository.findAllBookingRequest();
    }

    @Override
    public boolean updateRentACarBooking(RentACarBooking rentACarBooking) {
        int rentacarbookingtableid = rentACarBooking.getRentACarBookingTableId();
        int rentACarOwnerId = rentACarBooking.getRentACarOwnerId();
        return rentACarBookingRepository.updateRentACarBooking(rentACarOwnerId, rentacarbookingtableid);
    }
}
