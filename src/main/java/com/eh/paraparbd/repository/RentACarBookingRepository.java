package com.eh.paraparbd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eh.paraparbd.entity.RentACarBooking;

@Repository
public interface RentACarBookingRepository extends JpaRepository<RentACarBooking, Integer>{

    List<RentACarBooking> findByRentACarOwnerId(int rentACarOwnerId);

    @Query("SELECT cu FROM CommonUser cu")//FIXME
    List<RentACarBooking> findByTravelMonthAndOriginDistrictId(int dwpOwnerDistId, int currentMonth);

    @Query("SELECT rcb FROM RentACarBooking rcb WHERE rcb.travelMonth =?1 AND rcb.originDistrictId = ?2")
    List<RentACarBooking> getCurrentMonthRentForDwp(int currentMonth, int dwpOwnerDistId);

    @Query("SELECT rcb FROM RentACarBooking rcb WHERE rcb.travelMonth =?1 AND rcb.rentACarOwnerId = ?2")
    List<RentACarBooking> getCurrentMonthRentForRentACar(int currentMonth, int rentACarOwnerId);
    
    @Query("SELECT MAX(orderNumber) FROM RentACarBooking")
    Integer getMaxOrderNumber();
    
    @Query("SELECT rcb FROM RentACarBooking rcb WHERE NOT rcb.rentACarOwnerId = 0 AND rcb.commonUserId =?1")
    List<RentACarBooking> getRentACarBookingCommonUserId(int userId);

    @Query("SELECT rcb FROM RentACarBooking rcb WHERE rcb.authorizedOrNot='1'")
    List<RentACarBooking> findAllAuthorizedRequest();

    @Query("SELECT rcb FROM RentACarBooking rcb WHERE rcb.authorizedOrNot='0'")
    List<RentACarBooking> findAllBookingRequest();

    @Modifying
    @Transactional
    @Query("UPDATE RentACarBooking rcb SET rcb.authorizedOrNot='1', rcb.rentACarOwnerId =?1 WHERE rcb.rentACarBookingTableId = ?2")
    boolean updateRentACarBooking( int rentACarOwnerId, int rentacarbookingtableid);
}
