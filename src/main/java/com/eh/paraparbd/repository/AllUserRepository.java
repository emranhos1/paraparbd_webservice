package com.eh.paraparbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eh.paraparbd.entity.AllUser;

@Repository
public interface AllUserRepository extends JpaRepository<AllUser, Integer> {

    AllUser findByAllUserId(int allUserId);

    @Modifying
    @Transactional
    @Query("UPDATE AllUser au SET au.activeStatus = 1 WHERE au.allUserId = ?1 AND au.userRole = ?2")
    void activatingRentACar(int userId, String userRole);

    @Modifying
    @Transactional
    @Query("UPDATE AllUser au SET au.activeStatus = 0 WHERE au.allUserId = ?1 AND au.userRole = ?2")
    void inActivatingRentACar(int userId, String userRole);
}
