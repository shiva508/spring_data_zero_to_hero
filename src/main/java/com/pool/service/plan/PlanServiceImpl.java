package com.pool.service.plan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.domine.Plan;
import com.pool.model.CommonResponse;
import com.pool.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	private PlanRepository planRepository;

	@Override
	@Transactional
	public Plan savePlan(Plan plan) {
		
		return planRepository.save(plan);
	}

	@Override
	@Transactional
	public List<Plan> getAllPlans() {
		// TODO Auto-generated method stub
		return planRepository.findAll();
	}

	@Override
	@Transactional
	public Plan updatePlan(Plan plan) {
		// TODO Auto-generated method stub
		return planRepository.save(plan);
	}

	@Override
	@Transactional
	public Plan getPlanByPlanId(Long planId) {
		
		return null;
	}

	@Override
	@Transactional
	public CommonResponse deletePlanByPlanId(Long planId) {
		// TODO Auto-generated method stub
		return null;
	}

}
