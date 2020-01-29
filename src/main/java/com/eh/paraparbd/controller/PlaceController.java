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

import com.eh.paraparbd.entity.District;
import com.eh.paraparbd.entity.Division;
import com.eh.paraparbd.entity.PoliceStation;
import com.eh.paraparbd.service.DistrictService;
import com.eh.paraparbd.service.DivisionService;
import com.eh.paraparbd.service.PoliceStationService;

/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 2.0.0.00
 * +880670932273;+8801670932273;
 */
@RestController
@RequestMapping("/place")
public class PlaceController {

    @Autowired
    DistrictService districtService;

    @Autowired
    DivisionService divisionService;

    @Autowired
    PoliceStationService policeStationService;

    @GetMapping("/police-station")
    public Map<String, Object> allPoliceStation() throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        List<PoliceStation> policeStations = policeStationService.findAllPoliceStation();
        int total = policeStations.size();

        response.put("total", total);
        response.put("data", policeStations);
        response.put("success", CollectionUtils.isEmpty(policeStations) ? false : true);
        response.put("message", CollectionUtils.isEmpty(policeStations) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/police-station/{code}")
    public Map<String, Object> findByPoliceStationId(@PathVariable("code") int code) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        PoliceStation policeStation = policeStationService.findById(code);

        response.put("data", policeStation);
        response.put("total", ObjectUtils.isEmpty(policeStation) ? 0 : 1);
        response.put("success", ObjectUtils.isEmpty(policeStation) ? false : true);
        response.put("message", ObjectUtils.isEmpty(policeStation) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/district")
    public Map<String, Object> allDistrict() throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        List<District> districts = districtService.findAllDistrict();
        int total = districts.size();

        response.put("total", total);
        response.put("data", districts);
        response.put("success", CollectionUtils.isEmpty(districts) ? false : true);
        response.put("message", CollectionUtils.isEmpty(districts) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("district/{code}")
    public Map<String, Object> findByDistrictId(@PathVariable("code") int code) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        District district = districtService.findById(code);

        response.put("data", district);
        response.put("total", ObjectUtils.isEmpty(district) ? 0 : 1);
        response.put("success", ObjectUtils.isEmpty(district) ? false : true);
        response.put("message", ObjectUtils.isEmpty(district) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/division")
    public Map<String, Object> allDivision() throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        List<Division> divisions = divisionService.findAllDivision();
        int total = divisions.size();

        response.put("total", total);
        response.put("data", divisions);
        response.put("success", CollectionUtils.isEmpty(divisions) ? false : true);
        response.put("message", CollectionUtils.isEmpty(divisions) ? "No Record Found" : "Records Found");
        return response;
    }

    @GetMapping("/division/{code}")
    public Map<String, Object> findByDivisionId(@PathVariable("code") int code) throws IOException {

        Map<String, Object> response = new HashMap<String, Object>();
        Division division = divisionService.findById(code);

        response.put("data", division);
        response.put("total", ObjectUtils.isEmpty(division) ? 0 : 1);
        response.put("success", ObjectUtils.isEmpty(division) ? false : true);
        response.put("message", ObjectUtils.isEmpty(division) ? "No Record Found" : "Records Found");
        return response;
    }
}
