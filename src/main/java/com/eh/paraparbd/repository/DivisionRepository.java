package com.eh.paraparbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.paraparbd.entity.Division;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Integer> {

}
