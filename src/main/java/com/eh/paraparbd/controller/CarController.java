package com.eh.paraparbd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.paraparbd.entity.CarBrand;
import com.eh.paraparbd.entity.CarModel;
import com.eh.paraparbd.service.CarBrandService;
import com.eh.paraparbd.service.CarModelService;

/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 2.0.0.00
 * +880670932273;+8801670932273;
 */
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarBrandService carBrandService;

    @Autowired
    CarModelService carModelService;

    @GetMapping("/brand")
    public Map<String, Object> carBrand() throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        List<CarBrand> carBrand = carBrandService.findAllCarBrand();
        int total = carBrand.size();

        response.put("total", total);
        response.put("data", carBrand);
        response.put("success", CollectionUtils.isEmpty(carBrand) ? false : true);
        response.put("message", CollectionUtils.isEmpty(carBrand) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/brand/{code}")
    public Map<String, Object> findByCarBrandId(@PathVariable("code") int code) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        CarBrand carBrand = carBrandService.findById(code);

        response.put("data", carBrand);
        response.put("total", ObjectUtils.isEmpty(carBrand) ? 0 : 1);
        response.put("success", ObjectUtils.isEmpty(carBrand) ? false : true);
        response.put("message", ObjectUtils.isEmpty(carBrand) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/model")
    public Map<String, Object> allCarModel() throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        List<CarModel> carModels = carModelService.findAllCarModel();
        int total = carModels.size();

        response.put("total", total);
        response.put("data", carModels);
        response.put("success", CollectionUtils.isEmpty(carModels) ? false : true);
        response.put("message", CollectionUtils.isEmpty(carModels) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/model/{code}")
    public Map<String, Object> findByCarModelId(@PathVariable("code") int code) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        CarModel carModel = carModelService.findById(code);

        response.put("data", carModel);
        response.put("total", ObjectUtils.isEmpty(carModel) ? 0 : 1);
        response.put("success", ObjectUtils.isEmpty(carModel) ? false : true);
        response.put("message", ObjectUtils.isEmpty(carModel) ? "No Record Found" : "Records Found");
        return response;
    }
}
