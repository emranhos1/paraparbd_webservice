package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.repository.AllUserRepository;

@Service
public class AllUserServiceImpl implements AllUserService{

    @Autowired
    AllUserRepository allUserRepository;
    
    @Override
    public List<AllUser> findAllUser() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AllUser findByAllUserId(int allUserId) {
        return allUserRepository.findByAllUserId(allUserId);
    }

    @Override
    public void activatingRentACar(int allUserId) {
        String userRole = "RentACar";
        allUserRepository.activatingRentACar(allUserId, userRole);
    }

    @Override
    public void inActivatingRentACar(int allUserId) {
        String userRole = "RentACar";
        allUserRepository.inActivatingRentACar(allUserId, userRole);
    }
}
