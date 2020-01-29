package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rent_a_car_booking_table")
public class RentACarBooking {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "rent_a_car_booking_table_id")
    private int rentACarBookingTableId;
    @Column(name = "common_user_id")
    private int commonUserId;
    @Column(name = "rent_a_car_owner_id")
    private int rentACarOwnerId;
    @Column(name = "car_category_id")
    private int carCategoryId;
    @Column(name = "origin_division_id")
    private int originDivisionId;
    @Column(name = "origin_district_id")
    private int originDistrictId;
    @Column(name = "destination_division_id")
    private int destinationDivisionId;
    @Column(name = "destination_district_id")
    private int destinationDistrictId;
    @Column(name = "discount_id")
    private int discountId;
    @Column(name = "order_number")
    private int orderNumber;
    @Column(name = "origin")
    private String origin;
    @Column(name = "destination")
    private String destination;
    @Column(name = "payment_method")
    private String paymentMethod;
    @Column(name = "travel_date")
    private Date travelDate;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "authorized_or_not")
    private String authorizedOrNot;
    @Column(name = "pickup_address")
    private String pickupAddress;
    @Column(name = "drop_address")
    private String dropAddress;
    @Column(name = "total_fare")
    private double totalFare;
    @Column(name = "gross_fare")
    private double grossFare;
    @Column(name = "travel_month")
    private int travelMonth;

    public int getRentACarBookingTableId() {
        return rentACarBookingTableId;
    }

    public void setRentACarBookingTableId(int rentACarBookingTableId) {
        this.rentACarBookingTableId = rentACarBookingTableId;
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
