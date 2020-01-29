package com.eh.paraparbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eh.paraparbd.entity.DwpOwner;

public interface DwpOwnerRepository extends JpaRepository<DwpOwner, Integer>{

    DwpOwner findByPhoneNo(String phoneNo);
    DwpOwner findByDwpOwnerId(int dwpOwnerId);
}
