package com.eh.paraparbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.paraparbd.entity.CuSmsTable;

@Repository
public interface CuSmsTableRepository extends JpaRepository<CuSmsTable, Integer>{

    CuSmsTable findByRandomGenaratedCode(String randomGenaratedCode);
}
