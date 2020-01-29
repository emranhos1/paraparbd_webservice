package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.AllUser;

public interface AllUserService {

    List<AllUser> findAllUser();
    AllUser findByAllUserId(int allUserId);
    void activatingRentACar(int allUserId);
    void inActivatingRentACar(int allUserId);
}
