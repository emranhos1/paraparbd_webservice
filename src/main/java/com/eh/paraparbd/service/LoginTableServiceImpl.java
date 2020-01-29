package com.eh.paraparbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.LoginTable;
import com.eh.paraparbd.repository.LoginTableRepository;

@Service
public class LoginTableServiceImpl implements LoginTableService{

    @Autowired
    LoginTableRepository loginTableRepository;
    
    @Override
    public List<LoginTable> findLoginTable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LoginTable findByPhoneNo(String phoneNo) {
        return loginTableRepository.findByPhoneNo(phoneNo);
    }

    @Override
    public LoginTable findLoginUser(LoginTable loginTable) {
        String phoneNo = loginTable.getPhoneNo();
        String password = loginTable.getPassword();
        return loginTableRepository.findByPhoneNoAndPassword(phoneNo, password);
    }


}
