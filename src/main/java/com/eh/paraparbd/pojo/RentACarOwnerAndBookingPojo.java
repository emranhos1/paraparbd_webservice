//package com.eh.paraparbd.pojo;
//
//import java.util.Date;
//
//public class RentACarOwnerAndBookingPojo {
//
//    private int rentACarOwnerId;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String phoneNo;
//    private int divisionId;
//    private int districtId;
//    private int policeStationId;
//    private String address;
//    private String zipCode;
//    private String ownerPhoto;
//    private String nidNo;
//    private String nidScanCopy;
//    private String tinNo;
//    private String tinScanCopy;
//    private String tradeLisenceNo;
//    private String tradesScanCopy;
//    private String rentDeviceEmiNo;
//    private String gender;
//
//    private int rentACarBookingTableId;
//    private int commonUserId;
//    private int carCategoryId;
//    private int originDivisionId;
//    private int originDistrictId;
//    private int destinationDivisionId;
//    private int destinationDistrictId;
//    private int discountId;
//    private int orderNumber;
//    private String origin;
//    private String destination;
//    private String paymentMethod;
//    private Date travelDate;
//    private Date orderDate;
//    private String authorizedOrNot;
//    private String pickupAddress;
//    private String dropAddress;
//    private double totalFare;
//    private double grossFare;
//    private int travelMonth;
//
//    public int getRentACarOwnerId() {
//        return rentACarOwnerId;
//    }
//
//    public void setRentACarOwnerId(int rentACarOwnerId) {
//        this.rentACarOwnerId = rentACarOwnerId;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhoneNo() {
//        return phoneNo;
//    }
//
//    public void setPhoneNo(String phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//
//    public int getDivisionId() {
//        return divisionId;
//    }
//
//    public void setDivisionId(int divisionId) {
//        this.divisionId = divisionId;
//    }
//
//    public int getDistrictId() {
//        return districtId;
//    }
//
//    public void setDistrictId(int districtId) {
//        this.districtId = districtId;
//    }
//
//    public int getPoliceStationId() {
//        return policeStationId;
//    }
//
//    public void setPoliceStationId(int policeStationId) {
//        this.policeStationId = policeStationId;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getZipCode() {
//        return zipCode;
//    }
//
//    public void setZipCode(String zipCode) {
//        this.zipCode = zipCode;
//    }
//
//    public String getOwnerPhoto() {
//        return ownerPhoto;
//    }
//
//    public void setOwnerPhoto(String ownerPhoto) {
//        this.ownerPhoto = ownerPhoto;
//    }
//
//    public String getNidNo() {
//        return nidNo;
//    }
//
//    public void setNidNo(String nidNo) {
//        this.nidNo = nidNo;
//    }
//
//    public String getNidScanCopy() {
//        return nidScanCopy;
//    }
//
//    public void setNidScanCopy(String nidScanCopy) {
//        this.nidScanCopy = nidScanCopy;
//    }
//
//    public String getTinNo() {
//        return tinNo;
//    }
//
//    public void setTinNo(String tinNo) {
//        this.tinNo = tinNo;
//    }
//
//    public String getTinScanCopy() {
//        return tinScanCopy;
//    }
//
//    public void setTinScanCopy(String tinScanCopy) {
//        this.tinScanCopy = tinScanCopy;
//    }
//
//    public String getTradeLisenceNo() {
//        return tradeLisenceNo;
//    }
//
//    public void setTradeLisenceNo(String tradeLisenceNo) {
//        this.tradeLisenceNo = tradeLisenceNo;
//    }
//
//    public String getTradesScanCopy() {
//        return tradesScanCopy;
//    }
//
//    public void setTradesScanCopy(String tradesScanCopy) {
//        this.tradesScanCopy = tradesScanCopy;
//    }
//
//    public String getRentDeviceEmiNo() {
//        return rentDeviceEmiNo;
//    }
//
//    public void setRentDeviceEmiNo(String rentDeviceEmiNo) {
//        this.rentDeviceEmiNo = rentDeviceEmiNo;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getRentACarBookingTableId() {
//        return rentACarBookingTableId;
//    }
//
//    public void setRentACarBookingTableId(int rentACarBookingTableId) {
//        this.rentACarBookingTableId = rentACarBookingTableId;
//    }
//
//    public int getCommonUserId() {
//        return commonUserId;
//    }
//
//    public void setCommonUserId(int commonUserId) {
//        this.commonUserId = commonUserId;
//    }
//
//    public int getCarCategoryId() {
//        return carCategoryId;
//    }
//
//    public void setCarCategoryId(int carCategoryId) {
//        this.carCategoryId = carCategoryId;
//    }
//
//    public int getOriginDivisionId() {
//        return originDivisionId;
//    }
//
//    public void setOriginDivisionId(int originDivisionId) {
//        this.originDivisionId = originDivisionId;
//    }
//
//    public int getOriginDistrictId() {
//        return originDistrictId;
//    }
//
//    public void setOriginDistrictId(int originDistrictId) {
//        this.originDistrictId = originDistrictId;
//    }
//
//    public int getDestinationDivisionId() {
//        return destinationDivisionId;
//    }
//
//    public void setDestinationDivisionId(int destinationDivisionId) {
//        this.destinationDivisionId = destinationDivisionId;
//    }
//
//    public int getDestinationDistrictId() {
//        return destinationDistrictId;
//    }
//
//    public void setDestinationDistrictId(int destinationDistrictId) {
//        this.destinationDistrictId = destinationDistrictId;
//    }
//
//    public int getDiscountId() {
//        return discountId;
//    }
//
//    public void setDiscountId(int discountId) {
//        this.discountId = discountId;
//    }
//
//    public int getOrderNumber() {
//        return orderNumber;
//    }
//
//    public void setOrderNumber(int orderNumber) {
//        this.orderNumber = orderNumber;
//    }
//
//    public String getOrigin() {
//        return origin;
//    }
//
//    public void setOrigin(String origin) {
//        this.origin = origin;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public String getPaymentMethod() {
//        return paymentMethod;
//    }
//
//    public void setPaymentMethod(String paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public Date getTravelDate() {
//        return travelDate;
//    }
//
//    public void setTravelDate(Date travelDate) {
//        this.travelDate = travelDate;
//    }
//
//    public Date getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(Date orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public String getAuthorizedOrNot() {
//        return authorizedOrNot;
//    }
//
//    public void setAuthorizedOrNot(String authorizedOrNot) {
//        this.authorizedOrNot = authorizedOrNot;
//    }
//
//    public String getPickupAddress() {
//        return pickupAddress;
//    }
//
//    public void setPickupAddress(String pickupAddress) {
//        this.pickupAddress = pickupAddress;
//    }
//
//    public String getDropAddress() {
//        return dropAddress;
//    }
//
//    public void setDropAddress(String dropAddress) {
//        this.dropAddress = dropAddress;
//    }
//
//    public double getTotalFare() {
//        return totalFare;
//    }
//
//    public void setTotalFare(double totalFare) {
//        this.totalFare = totalFare;
//    }
//
//    public double getGrossFare() {
//        return grossFare;
//    }
//
//    public void setGrossFare(double grossFare) {
//        this.grossFare = grossFare;
//    }
//
//    public int getTravelMonth() {
//        return travelMonth;
//    }
//
//    public void setTravelMonth(int travelMonth) {
//        this.travelMonth = travelMonth;
//    }
//}
