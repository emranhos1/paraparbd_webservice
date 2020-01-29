package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.LoginTable;

public interface LoginTableService {

    List<LoginTable> findLoginTable();
    LoginTable findByPhoneNo(String phoneNo);
    LoginTable findLoginUser(LoginTable loginTable);

}
