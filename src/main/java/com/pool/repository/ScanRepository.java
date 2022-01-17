package com.pool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pool.domine.Scan;

@Repository
public interface ScanRepository extends JpaRepository<Scan, Long>{

}
