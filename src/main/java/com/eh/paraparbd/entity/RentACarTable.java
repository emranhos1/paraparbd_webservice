package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rent_a_car_table")
public class RentACarTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "rent_e_car_table_id")
    private int rentECarTableId;
    @Column(name = "car_category_id")
    private int carCategoryId;
    @Column(name = "rent_a_car_owner_id")
    private int rentACarOwnerId;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "active_date")
    private Date activeDate;
    @Column(name = "active_or_not")
    private int activeOrNot;

    public int getRentECarTableId() {
        return rentECarTableId;
    }

    public void setRentECarTableId(int rentECarTableId) {
        this.rentECarTableId = rentECarTableId;
    }

    public int getCarCategoryId() {
        return carCategoryId;
    }

    public void setCarCategoryId(int carCategoryId) {
        this.carCategoryId = carCategoryId;
    }

    public int getRentACarOwnerId() {
        return rentACarOwnerId;
    }

    public void setRentACarOwnerId(int rentACarOwnerId) {
        this.rentACarOwnerId = rentACarOwnerId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getActiveOrNot() {
        return activeOrNot;
    }

    public void setActiveOrNot(int activeOrNot) {
        this.activeOrNot = activeOrNot;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }
}
