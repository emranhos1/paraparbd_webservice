package com.eh.paraparbd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.paraparbd.entity.CarCategory;

@Repository
public interface CarCategoryRepository extends JpaRepository<CarCategory, Integer>{

    CarCategory findByCarRegiNo(String newCarRegNo);
    List<CarCategory> findByRentACarOwnerId(int rentACarOwnerId);
}
