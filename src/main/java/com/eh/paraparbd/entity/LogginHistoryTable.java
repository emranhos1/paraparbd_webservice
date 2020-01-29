package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loggin_history_table")
public class LogginHistoryTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "loggin_history_table_id")
    private int logginHistoryTableId;
    @Column(name = "all_user_id")
    private int allUserId;
    @Column(name = "user_device_mac")
    private String userDeviceMac;
    @Column(name = "user_device_ip")
    private String userDeviceIp;
    @Column(name = "logging_date_time")
    private Date loggingDateTime;
    @Column(name = "logout_date_time")
    private Date logoutDateTime;

    public int getLogginHistoryTableId() {
        return logginHistoryTableId;
    }

    public void setLogginHistoryTableId(int logginHistoryTableId) {
        this.logginHistoryTableId = logginHistoryTableId;
    }

    public int getAllUserId() {
        return allUserId;
    }

    public void setAllUserId(int allUserId) {
        this.allUserId = allUserId;
    }

    public String getUserDeviceMac() {
        return userDeviceMac;
    }

    public void setUserDeviceMac(String userDeviceMac) {
        this.userDeviceMac = userDeviceMac;
    }

    public String getUserDeviceIp() {
        return userDeviceIp;
    }

    public void setUserDeviceIp(String userDeviceIp) {
        this.userDeviceIp = userDeviceIp;
    }

    public Date getLoggingDateTime() {
        return loggingDateTime;
    }

    public void setLoggingDateTime(Date loggingDateTime) {
        this.loggingDateTime = loggingDateTime;
    }

    public Date getLogoutDateTime() {
        return logoutDateTime;
    }

    public void setLogoutDateTime(Date logoutDateTime) {
        this.logoutDateTime = logoutDateTime;
    }
}
