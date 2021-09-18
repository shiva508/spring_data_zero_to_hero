package com.pool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pool.domine.Plan;
import com.pool.model.PlanModel;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {
	@Query(name="plantitle_description_query",nativeQuery = true)
	public PlanModel getSomedata(); 

}
