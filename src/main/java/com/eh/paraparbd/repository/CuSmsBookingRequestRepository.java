package com.eh.paraparbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.paraparbd.entity.CuSmsBookingRequest;

@Repository
public interface CuSmsBookingRequestRepository extends JpaRepository<CuSmsBookingRequest, Integer>{

}
