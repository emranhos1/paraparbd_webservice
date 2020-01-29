package com.eh.paraparbd.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.RentACarTable;

@Repository
public interface RentACarTableRepository extends JpaRepository<RentACarTable, Integer>{

    @Query("SELECT rct FROM RentACarTable rct WHERE rct.activeOrNot = 1")
    List<RentACarTable> findAllActiveCar();

    @Query("SELECT rct FROM RentACarTable rct WHERE rct.activeOrNot = 0")
    List<RentACarTable> findAllInActiveCar();

    @Modifying
    @Transactional
    @Query("UPDATE RentACarTable rct SET rct.activeOrNot = 1, rct.activeDate =  ?1 WHERE rct.rentECarTableId = ?2")
    boolean activeCar(Date activeDate, int rentACarTableId);

    @Modifying
    @Transactional
    @Query("UPDATE RentACarTable rct SET rct.activeOrNot = 0 WHERE rct.rentECarTableId = ?1")
    boolean inActiveCar(int rentACarTableId);

    @Query("SELECT au FROM AllUser au WHERE au.activeStatus = 1 AND au.userRole = ?1")
    List<AllUser> findAllActiveRentACar(String userRole);

    @Query("SELECT au FROM AllUser au WHERE au.activeStatus = 0 AND au.userRole = ?1")
    List<AllUser> findAllInactiveRentACar(String userRole);
    
//    @Query("SELECT rct RentACarTable rct WHERE rct.rentACarOwnerId = (SELECT au.allUser FROM AllUser au WHERE au.activeStatus = 0)")

}
