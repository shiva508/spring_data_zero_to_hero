package com.pool.service.plan;

import java.util.List;

import com.pool.domine.Plan;
import com.pool.model.CommonResponse;

public interface PlanService {
	public Plan savePlan(Plan plan);

	public List<Plan> getAllPlans();

	public Plan updatePlan(Plan plan);

	public Plan getPlanByPlanId(Long planId);

	public CommonResponse deletePlanByPlanId(Long planId);
}
