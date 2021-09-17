package com.pool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pool.domine.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {

}
