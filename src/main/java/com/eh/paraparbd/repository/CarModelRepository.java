package com.eh.paraparbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.paraparbd.entity.CarModel;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Integer> {

}
