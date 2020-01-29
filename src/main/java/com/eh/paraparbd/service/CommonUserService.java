package com.eh.paraparbd.service;

import java.util.List;
import java.util.Map;

import com.eh.paraparbd.entity.CommonUser;
import com.eh.paraparbd.pojo.RegitrationPojo;

public interface CommonUserService {

    List<CommonUser> findAllCommonUser();
    CommonUser findByCommonUserId(int commonUserId);
    CommonUser findByPhoneNo(String phoneNo);

    Map<String, Object> insert(RegitrationPojo userRegPojo);

}
