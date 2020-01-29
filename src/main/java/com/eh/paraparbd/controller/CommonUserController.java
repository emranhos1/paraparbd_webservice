package com.eh.paraparbd.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.CuSmsBookingRequest;
import com.eh.paraparbd.entity.RentACarBooking;
import com.eh.paraparbd.pojo.RentACarBookingPojo;
import com.eh.paraparbd.service.AllUserService;
import com.eh.paraparbd.service.CuBkashTableService;
import com.eh.paraparbd.service.CuSmsBookingRequestService;
import com.eh.paraparbd.service.RentACarBookingService;
import com.eh.paraparbd.util.SMSUtil;

/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 2.0.0.00
 * +880670932273;+8801670932273;
 */
@RestController
@RequestMapping("/common-user")
public class CommonUserController {

    @Autowired
    RentACarBookingService rentACarBookingService;

    @Autowired
    AllUserService allUserService;

    @Autowired
    CuBkashTableService cuBkashTableService;

    @Autowired
    SMSUtil smsUtil;

    @Autowired
    CuSmsBookingRequestService cuSmsBookingRequestService;

    @GetMapping("/history/{allUserId}")
    public Map<String, Object> historyByUserId(@PathVariable("allUserId") int allUserId) throws IOException {
        //Notification
        Map<String, Object> response = new HashMap<String, Object>();
        AllUser commonUserDetails = allUserService.findByAllUserId(allUserId);
        int commonUserId = commonUserDetails.getUserId();
        
        List<RentACarBooking> history = rentACarBookingService.getHistory(commonUserId); //FIXME
        int total = history.size();
        
        response.put("total", total);
        response.put("data", history);
        response.put("success", CollectionUtils.isEmpty(history) ? false : true);
        response.put("message", CollectionUtils.isEmpty(history) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/pending/booking/{allUserId}")
    public Map<String, Object> pendingBooking(@PathVariable("allUserId") int allUserId) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        AllUser commonUserDetails = allUserService.findByAllUserId(allUserId);
        int commonUserId = commonUserDetails.getUserId();

        List<RentACarBooking> pendingBooking = cuBkashTableService.findPendingBooking(commonUserId);
        if(!CollectionUtils.isEmpty(pendingBooking)) {
            int total = pendingBooking.size();
            response.put("total", total);
            response.put("data", pendingBooking);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("total", 0);
            response.put("data", null);
            response.put("success", false);
            response.put("message", "No Record Found");
        }

        return response;
    }

    @GetMapping("/confirm/booking/{allUserId}")
    public Map<String, Object> confirmBooking(@PathVariable("allUserId") int allUserId) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        AllUser commonUserDetails = allUserService.findByAllUserId(allUserId);
        int commonUserId = commonUserDetails.getUserId();
        
        List<RentACarBooking> confirmBooking = cuBkashTableService.findConfirmBooking(commonUserId);
        if(!CollectionUtils.isEmpty(confirmBooking)) {
            int total = confirmBooking.size();
            response.put("total", total);
            response.put("data", confirmBooking);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("total", 0);
            response.put("data", null);
            response.put("success", false);
            response.put("message", "No Record Found");
        }

        return response;
    }

    @PostMapping("/booking")
    public Map<String, Object> commonUserRegistration(@RequestBody RentACarBookingPojo rentACarBookingPojo) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        RentACarBooking rentACarBooking = new RentACarBooking();
        CuSmsBookingRequest bookingRequest = new CuSmsBookingRequest();
        int orderNumber = 0;

        //Get Last Order Number From Rent A Car Booking Table
        Integer getOrderNumber = rentACarBookingService.getMaxOrderNumber();
        if (ObjectUtils.isEmpty(getOrderNumber)) {
            orderNumber = 1729;
        } else {
            orderNumber = getOrderNumber + 1;
        }

        Date travelDate = rentACarBookingPojo.getTravelDate();
        //DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd KK:mm a");
        //DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String travelDate = outputFormat.format(inputFormat.parse(travelD));

        //Get Common User ID
        AllUser allUser = allUserService.findByAllUserId(rentACarBookingPojo.getAllUserId());
        int commonUserId = allUser.getUserId();

        int rentACarOwnerId = 0;
        int discountId = 0;
        double gross_fare = 0;
        String paymentMethod = "Cash";
        String authorized = "0";
        int travelMonth = Calendar.getInstance().get(Calendar.ERA);

        rentACarBooking.setCommonUserId(commonUserId);
        rentACarBooking.setRentACarOwnerId(rentACarOwnerId);
        rentACarBooking.setCarCategoryId(rentACarBookingPojo.getCarCategoryId());
        rentACarBooking.setOriginDivisionId(rentACarBookingPojo.getOriginDivisionId());
        rentACarBooking.setOriginDistrictId(rentACarBookingPojo.getOriginDistrictId());
        rentACarBooking.setDestinationDivisionId(rentACarBookingPojo.getDestinationDivisionId());
        rentACarBooking.setDestinationDistrictId(rentACarBookingPojo.getDestinationDistrictId());
        rentACarBooking.setOrigin(rentACarBookingPojo.getOrigin());
        rentACarBooking.setDestination(rentACarBookingPojo.getDestination());
        rentACarBooking.setTotalFare(rentACarBookingPojo.getTotalFare());
        rentACarBooking.setDiscountId(discountId);
        rentACarBooking.setGrossFare(gross_fare);
        rentACarBooking.setPaymentMethod(paymentMethod);
        rentACarBooking.setTravelDate(travelDate);
        rentACarBooking.setTravelMonth(travelMonth);
        rentACarBooking.setAuthorizedOrNot(authorized);
        rentACarBooking.setPickupAddress(rentACarBookingPojo.getPickupAddress());
        rentACarBooking.setDropAddress(rentACarBookingPojo.getDropAddress());
        rentACarBooking.setOrderNumber(orderNumber);

        //Save Rent A Car Booking Table
        RentACarBooking bookingResponse = rentACarBookingService.insert(rentACarBooking);
        if (!ObjectUtils.isEmpty(bookingResponse)){
            //Sending SMS //FIXME
            String sendingSMS;
            String smsForBooking = smsUtil.smsForBooking(commonUserId, orderNumber);//FIXME
            String[] output = smsForBooking.split("~");

            bookingRequest.setCommonUserId(commonUserId);
            bookingRequest.setTextBody(output[0]);
            bookingRequest.setSmsStatus(output[1]);
            bookingRequest.setRequestDate(new Date());

            //Save Booking Request Table 
            cuSmsBookingRequestService.insert(bookingRequest);
        } else{ }

        response.put("data", bookingResponse);
        response.put("success", ObjectUtils.isEmpty(bookingResponse) ? false : true);
        response.put("message", ObjectUtils.isEmpty(bookingResponse) ? "Rent A Car Not Booked! Please Try again" : "Rent A Car Booked!");

        return response;
    }
}
