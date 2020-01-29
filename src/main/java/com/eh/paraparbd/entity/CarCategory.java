package com.eh.paraparbd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_category")
public class CarCategory {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "car_category_id")
    private int carCategoryId;
    @Column(name = "brand_id")
    private int brandId;
    @Column(name = "car_model_id")
    private int carModelId;
    @Column(name = "car_sit")
    private int carSit;
    @Column(name = "color_id")
    private int colorId;
    @Column(name = "car_registration_no")
    private String carRegiNo;
    @Column(name = "tex_token_no")
    private String texTokenNo;
    @Column(name = "car_fitness_no")
    private String carFitnessNo;
    @Column(name = "car_registration_scan_copy")
    private String carRegiScanCopy;
    @Column(name = "rent_a_car_owner_id")
    private int rentACarOwnerId;

    public int getCarCategoryId() {
        return carCategoryId;
    }

    public void setCarCategoryId(int carCategoryId) {
        this.carCategoryId = carCategoryId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getCarModelId() {
        return carModelId;
    }

    public void setCarModelId(int carModelId) {
        this.carModelId = carModelId;
    }

    public int getCarSit() {
        return carSit;
    }

    public void setCarSit(int carSit) {
        this.carSit = carSit;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getCarRegiNo() {
        return carRegiNo;
    }

    public void setCarRegiNo(String carRegiNo) {
        this.carRegiNo = carRegiNo;
    }

    public String getTexTokenNo() {
        return texTokenNo;
    }

    public void setTexTokenNo(String texTokenNo) {
        this.texTokenNo = texTokenNo;
    }

    public String getCarFitnessNo() {
        return carFitnessNo;
    }

    public void setCarFitnessNo(String carFitnessNo) {
        this.carFitnessNo = carFitnessNo;
    }

    public String getCarRegiScanCopy() {
        return carRegiScanCopy;
    }

    public void setCarRegiScanCopy(String carRegiScanCopy) {
        this.carRegiScanCopy = carRegiScanCopy;
    }

    public int getRentACarOwnerId() {
        return rentACarOwnerId;
    }

    public void setRentACarOwnerId(int rentACarOwnerId) {
        this.rentACarOwnerId = rentACarOwnerId;
    }
}
