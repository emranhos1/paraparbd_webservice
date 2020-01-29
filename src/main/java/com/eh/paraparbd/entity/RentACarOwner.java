package com.eh.paraparbd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rent_a_car_owner")
public class RentACarOwner {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "rent_a_car_owner_id")
    private int rentACarOwnerId;
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
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "owner_photo")
    private String ownerPhoto;
    @Column(name = "nid_no")
    private String nidNo;
    @Column(name = "nid_scan_copy")
    private String nidScanCopy;
    @Column(name = "tin_no")
    private String tinNo;
    @Column(name = "tin_scan_copy")
    private String tinScanCopy;
    @Column(name = "trade_lisence_no")
    private String tradeLisenceNo;
    @Column(name = "trades_scan_copy")
    private String tradesScanCopy;
    @Column(name = "rent_device_emi_no")
    private String rentDeviceEmiNo;
    @Column(name = "gender")
    private String gender;

    public int getRentACarOwnerId() {
        return rentACarOwnerId;
    }

    public void setRentACarOwnerId(int rentACarOwnerId) {
        this.rentACarOwnerId = rentACarOwnerId;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getOwnerPhoto() {
        return ownerPhoto;
    }

    public void setOwnerPhoto(String ownerPhoto) {
        this.ownerPhoto = ownerPhoto;
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

    public String getTinNo() {
        return tinNo;
    }

    public void setTinNo(String tinNo) {
        this.tinNo = tinNo;
    }

    public String getTinScanCopy() {
        return tinScanCopy;
    }

    public void setTinScanCopy(String tinScanCopy) {
        this.tinScanCopy = tinScanCopy;
    }

    public String getTradeLisenceNo() {
        return tradeLisenceNo;
    }

    public void setTradeLisenceNo(String tradeLisenceNo) {
        this.tradeLisenceNo = tradeLisenceNo;
    }

    public String getTradesScanCopy() {
        return tradesScanCopy;
    }

    public void setTradesScanCopy(String tradesScanCopy) {
        this.tradesScanCopy = tradesScanCopy;
    }

    public String getRentDeviceEmiNo() {
        return rentDeviceEmiNo;
    }

    public void setRentDeviceEmiNo(String rentDeviceEmiNo) {
        this.rentDeviceEmiNo = rentDeviceEmiNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
