package com.eh.paraparbd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eh.paraparbd.entity.CuBkashTable;
import com.eh.paraparbd.entity.RentACarBooking;

@Repository
public interface CuBkashTableRepository extends JpaRepository<CuBkashTable, Integer>{

    @Query("SELECT bt FROM RentACarBooking bt WHERE bt.commonUserId = ?1 AND bt.authorizedOrNot = 0")
    List<RentACarBooking> findPendingBooking(int userId);

    @Query("SELECT bt FROM RentACarBooking bt WHERE bt.commonUserId = ?1 AND bt.authorizedOrNot = 1")
    List<RentACarBooking> findConfirmBooking(int userId);
}
