package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_driver")
public class CarDriver {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "car_driver_id")
    private int carDriverId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "division_id")
    private int divisionId;
    @Column(name = "district_id")
    private int districtId;
    @Column(name = "police_station_id")
    private int policeStationId;
    @Column(name = "address")
    private String address;
    @Column(name = "device_ime_no")
    private String deviceImeNo;
    @Column(name = "photo")
    private String photo;
    @Column(name = "nid_no")
    private String nidNo;
    @Column(name = "nid_scan_copy")
    private String nidScanCopy;
    @Column(name = "driving_liscense_no")
    private String drivingLiscenseNo;
    @Column(name = "liscence_scan_copy")
    private String liscenceScanCopy;
    @Column(name = "car_registration_number")
    private String carRegistrationNumber;
    @Column(name = "car_registarion_date")
    private Date carRegistarionDate;
    @Column(name = "created_date")
    private Date createdDate;

    public int getCarDriverId() {
        return carDriverId;
    }

    public void setCarDriverId(int carDriverId) {
        this.carDriverId = carDriverId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public int getPoliceStationId() {
        return policeStationId;
    }

    public void setPoliceStationId(int policeStationId) {
        this.policeStationId = policeStationId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeviceImeNo() {
        return deviceImeNo;
    }

    public void setDeviceImeNo(String deviceImeNo) {
        this.deviceImeNo = deviceImeNo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNidNo() {
        return nidNo;
    }

    public void setNidNo(String nidNo) {
        this.nidNo = nidNo;
    }

    public String getNidScanCopy() {
        return nidScanCopy;
    }

    public void setNidScanCopy(String nidScanCopy) {
        this.nidScanCopy = nidScanCopy;
    }

    public String getDrivingLiscenseNo() {
        return drivingLiscenseNo;
    }

    public void setDrivingLiscenseNo(String drivingLiscenseNo) {
        this.drivingLiscenseNo = drivingLiscenseNo;
    }

    public String getLiscenceScanCopy() {
        return liscenceScanCopy;
    }

    public void setLiscenceScanCopy(String liscenceScanCopy) {
        this.liscenceScanCopy = liscenceScanCopy;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public void setCarRegistrationNumber(String carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
    }

    public Date getCarRegistarionDate() {
        return carRegistarionDate;
    }

    public void setCarRegistarionDate(Date carRegistarionDate) {
        this.carRegistarionDate = carRegistarionDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
