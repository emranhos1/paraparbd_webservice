package com.eh.paraparbd.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.RentACarTable;
import com.eh.paraparbd.repository.RentACarTableRepository;

@Service
public class RentACarTableServiceImpl implements RentACarTableService{

    @Autowired
    RentACarTableRepository rentACarTableRepository;
    
    @Override
    public List<RentACarTable> findRentACarTable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RentACarTable findById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RentACarTable insert(RentACarTable rentACarTable) {
        return rentACarTableRepository.save(rentACarTable);
    }

    @Override
    public List<RentACarTable> findAllActiveCar() {
        return rentACarTableRepository.findAllActiveCar();
    }

    @Override
    public List<RentACarTable> findAllInActiveCar() {
        return rentACarTableRepository.findAllInActiveCar();
    }

    @Override
    public boolean activeCar(int rentACarTableId) {
        Date activeDate = new Date();
        return rentACarTableRepository.activeCar(activeDate, rentACarTableId);
    }

    @Override
    public boolean inActiveCar(int rentACarTableId) {
        return rentACarTableRepository.inActiveCar(rentACarTableId);
    }

    @Override
    public List<AllUser> findAllActiveRentACar() {
        String userRole = "RentACar";
        return rentACarTableRepository.findAllActiveRentACar(userRole);
    }

    @Override
    public List<AllUser> findAllInactiveRentACar() {
        String userRole = "RentACar";
        return rentACarTableRepository.findAllInactiveRentACar(userRole);
    }
}
