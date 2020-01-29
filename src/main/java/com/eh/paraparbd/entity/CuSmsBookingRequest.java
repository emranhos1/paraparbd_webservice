package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cu_sms_booking_request_table")
public class CuSmsBookingRequest {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cu_booking_request_table_id")
    private int cuBookingRequestTableId;
    @Column(name = "text_body")
    private String textBody;
    @Column(name = "common_user_id")
    private int commonUserId;
    @Column(name = "sms_status")
    private String smsStatus;
    @Column(name = "request_date")
    private Date requestDate;

    public int getCuBookingRequestTableId() {
        return cuBookingRequestTableId;
    }

    public void setCuBookingRequestTableId(int cuBookingRequestTableId) {
        this.cuBookingRequestTableId = cuBookingRequestTableId;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public int getCommonUserId() {
        return commonUserId;
    }

    public void setCommonUserId(int commonUserId) {
        this.commonUserId = commonUserId;
    }

    public String getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
}
