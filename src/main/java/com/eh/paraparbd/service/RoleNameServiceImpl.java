package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eh.paraparbd.entity.RoleName;
import com.eh.paraparbd.repository.RoleNameRepository;

public class RoleNameServiceImpl implements RoleNameService{

    @Autowired
    RoleNameRepository repository;
    
    @Override
    public List<RoleName> findRoleName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RoleName findById() {
        // TODO Auto-generated method stub
        return null;
    }


}
