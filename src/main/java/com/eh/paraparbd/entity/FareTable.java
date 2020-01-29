package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fare_table")
public class FareTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "fare_table_id")
    private int fareTableId;
    @Column(name = "from_place")
    private String fromPlace;
    @Column(name = "destination")
    private String destination;
    @Column(name = "fare_amount")
    private double fareAmount;
    @Column(name = "data_entry_date")
    private Date dataEntryDate;

    public int getFareTableId() {
        return fareTableId;
    }

    public void setFareTableId(int fareTableId) {
        this.fareTableId = fareTableId;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(double fareAmount) {
        this.fareAmount = fareAmount;
    }

    public Date getDataEntryDate() {
        return dataEntryDate;
    }

    public void setDataEntryDate(Date dataEntryDate) {
        this.dataEntryDate = dataEntryDate;
    }
}
