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
import com.eh.paraparbd.entity.CarCategory;
import com.eh.paraparbd.entity.RentACarBooking;
import com.eh.paraparbd.entity.RentACarTable;
import com.eh.paraparbd.pojo.NewCarRegitrationPojo;
import com.eh.paraparbd.service.AllUserService;
import com.eh.paraparbd.service.CarCategoryService;
import com.eh.paraparbd.service.RentACarBookingService;
import com.eh.paraparbd.service.RentACarTableService;

/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 2.0.0.00
 * +880670932273;+8801670932273;
 */
@RestController
@RequestMapping("/rent-a-car")
public class RentACarController {

    @Autowired
    RentACarBookingService rentACarBookingService;

    @Autowired
    AllUserService allUserService;

    @Autowired
    CarCategoryService carCategoryService;

    @Autowired
    RentACarTableService rentACarTableService;

    @PostMapping("/add-new-car")
    public Map<String, Object> addNewCar(@RequestBody NewCarRegitrationPojo newCarRegitrationPojo) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        CarCategory carCategory = new CarCategory();
        RentACarTable rentACarTable = new RentACarTable();

        int allUserId = newCarRegitrationPojo.getAllUserId();
        AllUser rentACarDetails = allUserService.findByAllUserId(allUserId);
        int rentACarOwnerId = rentACarDetails.getUserId();
        
        CarCategory hasRegNo = carCategoryService.findByRegiNo(newCarRegitrationPojo.getCarRegiNo());
        if(ObjectUtils.isEmpty(hasRegNo)) {
            //File Upload //FIXME
            String fileName;
            //FileUpload file = fileUpload(Part file); 
            
            carCategory.setBrandId(newCarRegitrationPojo.getBrandId());
            carCategory.setCarModelId(newCarRegitrationPojo.getCarModelId());
            carCategory.setCarSit(newCarRegitrationPojo.getCarSit());
            carCategory.setColorId(newCarRegitrationPojo.getColorId());
            carCategory.setCarRegiNo(newCarRegitrationPojo.getCarRegiNo());
            carCategory.setTexTokenNo(newCarRegitrationPojo.getTexTokenNo());
            carCategory.setCarFitnessNo(newCarRegitrationPojo.getCarFitnessNo());
            carCategory.setCarRegiScanCopy(newCarRegitrationPojo.getCarRegiScanCopy());;
            carCategory.setRentACarOwnerId(rentACarOwnerId);
            
            CarCategory insertCarCategory = carCategoryService.insert(carCategory);
            if(!ObjectUtils.isEmpty(insertCarCategory)) {
                int active = 0;
                int carCategoryId = insertCarCategory.getCarCategoryId();
                rentACarTable.setCarCategoryId(carCategoryId);
                rentACarTable.setRentACarOwnerId(rentACarOwnerId);
                rentACarTable.setCreatedDate(new Date());
                rentACarTable.setActiveOrNot(active);
                
                RentACarTable insertRentACarTable = rentACarTableService.insert(rentACarTable);
                if(!ObjectUtils.isEmpty(insertRentACarTable)) {
                    response.put("data", insertCarCategory);
                    response.put("total", 1);
                    response.put("message", "New Car Save Successfully");
                } else {
                    response.put("data", null);
                    response.put("total", 0);
                    response.put("message", "New Car Save Unsuccessfully");
                }
            } else {
                response.put("data", null);
                response.put("total", 0);
                response.put("message", "Car Category Save Unsuccessfully");
            }
        } else {
            response.put("data", null);
            response.put("total", 0);
            response.put("message", "This Registration No Already Registered");
        }

        return response;
    }

    @GetMapping("/all-car/{allUserId}")
    public Map<String, Object> getAllRentedCar(@PathVariable("allUserId") int allUserId) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        AllUser rentACarDetails = allUserService.findByAllUserId(allUserId);
        int rentACarOwnerId = rentACarDetails.getUserId();

        List<CarCategory> carCategory = carCategoryService.findByRentACarOwnerId(rentACarOwnerId);
        if (!CollectionUtils.isEmpty(carCategory)) {
            int total = carCategory.size();
            response.put("data", carCategory);
            response.put("total", total);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("data", null);
            response.put("total", 0);
            response.put("success", false);
            response.put("message", "No Records Found");
        }

        return response;
    }

    @GetMapping("/rented-car/{allUserId}")
    public Map<String, Object> getAllCar(@PathVariable("allUserId") int allUserId) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        AllUser rentACarDetails = allUserService.findByAllUserId(allUserId);
        int rentACarOwnerId = rentACarDetails.getUserId();

        List<RentACarBooking> rentACarBookings = rentACarBookingService.findByRentACarOwnerId(rentACarOwnerId);
        if (!CollectionUtils.isEmpty(rentACarBookings)) {
            int total = rentACarBookings.size();
            response.put("data", rentACarBookings);
            response.put("total", total);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("data", null);
            response.put("total", 0);
            response.put("success", false);
            response.put("message", "No Records Found");
        }

        return response;
    }

    @GetMapping("/current-month-rent/{allUserId}")
    public Map<String, Object> curerntMonthRent(@PathVariable("allUserId") int allUserId) throws IOException {
        Map<String, Object> response = new HashMap<String, Object>();
        RentACarBooking rentACarBooking = new RentACarBooking();

        AllUser rentACarOwnerDetails = allUserService.findByAllUserId(allUserId);
        int rentACarOwnerId = rentACarOwnerDetails.getUserId();
        int currentMonth = Calendar.getInstance().get(Calendar.ERA);

        rentACarBooking.setTravelMonth(currentMonth);
        rentACarBooking.setRentACarOwnerId(rentACarOwnerId);

        //FIXME need to join query
        int joinquery;
        List<RentACarBooking> getCurentMonthRent = rentACarBookingService.getCurentMonthRentForRentACar(rentACarBooking);
        if (!CollectionUtils.isEmpty(getCurentMonthRent)) {
            int total = getCurentMonthRent.size();

            response.put("data", getCurentMonthRent);
            response.put("total", total);
            response.put("success", true);
            response.put("message", "Records Found");
        } else {
            response.put("data", null);
            response.put("total", 0);
            response.put("success", false);
            response.put("message", "No Record Found");
        }

        return response;
    }
}
