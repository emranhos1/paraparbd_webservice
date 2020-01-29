package com.eh.paraparbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.paraparbd.entity.LoginTable;

@Repository
public interface LoginTableRepository extends JpaRepository<LoginTable, Integer>{

    LoginTable findByPhoneNo(String phoneNo);
    LoginTable findByPhoneNoAndPassword(String phoneNo, String password);
}
