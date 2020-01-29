package com.eh.paraparbd.service;

import java.util.List;

import com.eh.paraparbd.entity.AllUser;
import com.eh.paraparbd.entity.RentACarTable;

public interface RentACarTableService {

    List<RentACarTable> findRentACarTable();
    List<RentACarTable> findAllActiveCar();
    List<RentACarTable> findAllInActiveCar();
    List<AllUser> findAllActiveRentACar();
    List<AllUser> findAllInactiveRentACar();

    RentACarTable findById();

    RentACarTable insert(RentACarTable rentACarTable);
    boolean activeCar(int rentACarTableId);
    boolean inActiveCar(int rentACarTableId);
}
