package com.eh.paraparbd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cu_sms_table")
public class CuSmsTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cu_sms_table_id")
    private int cuSmsTableId;
    @Column(name = "all_user_id")
    private int allUserId;
    @Column(name = "sms_status")
    private String smsStatus;
    @Column(name = "mobile_no")
    private String mobileNo;
    @Column(name = "response_code")
    private String responseCode;
    @Column(name = "random_genarated_code")
    private String randomGenaratedCode;

    public int getCuSmsTableId() {
        return cuSmsTableId;
    }

    public void setCuSmsTableId(int cuSmsTableId) {
        this.cuSmsTableId = cuSmsTableId;
    }

    public int getAllUserId() {
        return allUserId;
    }

    public void setAllUserId(int allUserId) {
        this.allUserId = allUserId;
    }

    public String getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getRandomGenaratedCode() {
        return randomGenaratedCode;
    }

    public void setRandomGenaratedCode(String randomGenaratedCode) {
        this.randomGenaratedCode = randomGenaratedCode;
    }
}
