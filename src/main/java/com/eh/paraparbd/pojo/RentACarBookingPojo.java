package com.eh.paraparbd.pojo;

import java.util.Date;

public class RentACarBookingPojo {

    private int allUserId;
    private int commonUserId;
    private int rentACarOwnerId;
    private int carCategoryId;
    private int originDivisionId;
    private int originDistrictId;
    private int destinationDivisionId;
    private int destinationDistrictId;
    private int discountId;
    private int orderNumber;
    private String origin;
    private String destination;
    private String paymentMethod;
    private Date travelDate;
    private Date orderDate;
    private String authorizedOrNot;
    private String pickupAddress;
    private String dropAddress;
    private double totalFare;
    private double grossFare;
    private int travelMonth;

    public int getAllUserId() {
        return allUserId;
    }

    public void setAllUserId(int allUserId) {
        this.allUserId = allUserId;
    }

    public int getCommonUserId() {
        return commonUserId;
    }

    public void setCommonUserId(int commonUserId) {
        this.commonUserId = commonUserId;
    }

    public int getRentACarOwnerId() {
        return rentACarOwnerId;
    }

    public void setRentACarOwnerId(int rentACarOwnerId) {
        this.rentACarOwnerId = rentACarOwnerId;
    }

    public int getCarCategoryId() {
        return carCategoryId;
    }

    public void setCarCategoryId(int carCategoryId) {
        this.carCategoryId = carCategoryId;
    }

    public int getOriginDivisionId() {
        return originDivisionId;
    }

    public void setOriginDivisionId(int originDivisionId) {
        this.originDivisionId = originDivisionId;
    }

    public int getOriginDistrictId() {
        return originDistrictId;
    }

    public void setOriginDistrictId(int originDistrictId) {
        this.originDistrictId = originDistrictId;
    }

    public int getDestinationDivisionId() {
        return destinationDivisionId;
    }

    public void setDestinationDivisionId(int destinationDivisionId) {
        this.destinationDivisionId = destinationDivisionId;
    }

    public int getDestinationDistrictId() {
        return destinationDistrictId;
    }

    public void setDestinationDistrictId(int destinationDistrictId) {
        this.destinationDistrictId = destinationDistrictId;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAuthorizedOrNot() {
        return authorizedOrNot;
    }

    public void setAuthorizedOrNot(String authorizedOrNot) {
        this.authorizedOrNot = authorizedOrNot;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public String getDropAddress() {
        return dropAddress;
    }

    public void setDropAddress(String dropAddress) {
        this.dropAddress = dropAddress;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public double getGrossFare() {
        return grossFare;
    }

    public void setGrossFare(double grossFare) {
        this.grossFare = grossFare;
    }

    public int getTravelMonth() {
        return travelMonth;
    }

    public void setTravelMonth(int travelMonth) {
        this.travelMonth = travelMonth;
    }
}
