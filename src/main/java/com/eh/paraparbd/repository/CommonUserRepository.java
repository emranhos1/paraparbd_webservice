package com.eh.paraparbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.paraparbd.entity.CommonUser;

@Repository
public interface CommonUserRepository extends JpaRepository<CommonUser, Integer> {

    CommonUser findByPhoneNo(String phoneNo);
    CommonUser findByCommonUserId(int commonUserId);
}
