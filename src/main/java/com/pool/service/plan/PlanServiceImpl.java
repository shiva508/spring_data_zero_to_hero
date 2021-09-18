package com.pool.service.plan;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.configuration.exception.NoRecardsFoundException;
import com.pool.constants.StudentpoolConstants;
import com.pool.domine.Plan;
import com.pool.model.CommonResponse;
import com.pool.model.PlanModel;
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
		List<Plan> plans=planRepository.findAll();
		if(plans==null ||plans.size()==0) {
			throw new NoRecardsFoundException(StudentpoolConstants.NO_DATA_FOUND_MESSAGE);
		}
		return plans;
	}

	@Override
	@Transactional
	public Plan updatePlan(Plan plan) {
		
		return planRepository.save(plan);
	}

	@Override
	@Transactional
	public Plan getPlanByPlanId(Long planId) {
		Plan  searchedPlan=planRepository.getById(planId);
		if(null==searchedPlan) {
			throw new NoRecardsFoundException(StudentpoolConstants.SEARCH_NO_DATA_FOUND_MESSAGE);
		}
		return searchedPlan;
	}

	@Override
	@Transactional
	public CommonResponse deletePlanByPlanId(Long planId) {
		planRepository.deleteById(planId);
		return new CommonResponse().setMessageName(StudentpoolConstants.DELETE_PLAN_MESSAGE).setTimeStamp(new Date());
	}

	@Override
	@Transactional
	public List<PlanModel> getCustomPlanData() {
		return planRepository.getCustomPlanData();
	}

}
