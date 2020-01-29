package com.eh.paraparbd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login_table")
public class LoginTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "login_table_id")
    private int loginTableId;
    @Column(name = "all_user_id")
    private int allUserId;
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "password")
    private String password;

    public int getLoginTableId() {
        return loginTableId;
    }

    public void setLoginTableId(int loginTableId) {
        this.loginTableId = loginTableId;
    }

    public int getAllUserId() {
        return allUserId;
    }

    public void setAllUserId(int allUserId) {
        this.allUserId = allUserId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
