package com.eh.paraparbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.paraparbd.entity.PoliceStation;

@Repository
public interface PoliceStationRepository extends JpaRepository<PoliceStation, Integer> {

}
