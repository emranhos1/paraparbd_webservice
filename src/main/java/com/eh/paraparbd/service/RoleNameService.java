package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.RoleName;

public interface RoleNameService {

    public List<RoleName> findRoleName();
    public RoleName findById();

}
