package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cu_fare_rate_table")
public class CuFareRateTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cu_fare_rate_table_id")
    private int cuFareRateTableId;
    @Column(name = "par_km_rate")
    private String parKmRate;
    @Column(name = "bodyLess200km")
    private String bodyLess200km;
    @Column(name = "bodyBig200km")
    private String bodyBig200km;
    @Column(name = "driver_cost")
    private String driverCost;
    @Column(name = "other_cost")
    private String otherCost;
    @Column(name = "updateDate")
    private Date update_date;
    @Column(name = "active_status")
    private String activeStatus;

    public int getCuFareRateTableId() {
        return cuFareRateTableId;
    }

    public void setCuFareRateTableId(int cuFareRateTableId) {
        this.cuFareRateTableId = cuFareRateTableId;
    }

    public String getParKmRate() {
        return parKmRate;
    }

    public void setParKmRate(String parKmRate) {
        this.parKmRate = parKmRate;
    }

    public String getBodyLess200km() {
        return bodyLess200km;
    }

    public void setBodyLess200km(String bodyLess200km) {
        this.bodyLess200km = bodyLess200km;
    }

    public String getBodyBig200km() {
        return bodyBig200km;
    }

    public void setBodyBig200km(String bodyBig200km) {
        this.bodyBig200km = bodyBig200km;
    }

    public String getDriverCost() {
        return driverCost;
    }

    public void setDriverCost(String driverCost) {
        this.driverCost = driverCost;
    }

    public String getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(String otherCost) {
        this.otherCost = otherCost;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }
}
