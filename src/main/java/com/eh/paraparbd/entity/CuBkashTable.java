package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cu_bkash_table")
public class CuBkashTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "bkash_table_id")
    private int bkashTableId;
    @Column(name = "common_user_id")
    private int commonUserId;
    @Column(name = "transactionNo")
    private String transaction_no;
    @Column(name = "transaction_date")
    private String transactionDate;
    @Column(name = "panding_or_not")
    private int pandingOrNot;
    @Column(name = "order_no")
    private int orderNo;
    @Column(name = "massage")
    private String massage;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "updated_date")
    private Date updatedDate;

    public int getBkashTableId() {
        return bkashTableId;
    }

    public void setBkashTableId(int bkashTableId) {
        this.bkashTableId = bkashTableId;
    }

    public int getCommonUserId() {
        return commonUserId;
    }

    public void setCommonUserId(int commonUserId) {
        this.commonUserId = commonUserId;
    }

    public String getTransaction_no() {
        return transaction_no;
    }

    public void setTransaction_no(String transaction_no) {
        this.transaction_no = transaction_no;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getPandingOrNot() {
        return pandingOrNot;
    }

    public void setPandingOrNot(int pandingOrNot) {
        this.pandingOrNot = pandingOrNot;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
