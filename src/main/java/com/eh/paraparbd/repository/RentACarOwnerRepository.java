package com.eh.paraparbd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eh.paraparbd.entity.RentACarOwner;

public interface RentACarOwnerRepository extends JpaRepository<RentACarOwner, Integer>{

    List<RentACarOwner> findByDistrictId(int dwpDistrictIdd);
    RentACarOwner findByPhoneNo(String phoneNo);
    RentACarOwner findByRentACarOwnerId(int rentACarOwnerId);
}
