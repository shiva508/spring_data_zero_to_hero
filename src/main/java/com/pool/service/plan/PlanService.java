package com.pool.service.plan;

import java.util.List;
import java.util.stream.Stream;

import com.pool.domine.Plan;
import com.pool.model.CommonResponse;
import com.pool.model.PlanModel;

public interface PlanService {
	public Plan savePlan(Plan plan);

	public List<Plan> getAllPlans();

	public Plan updatePlan(Plan plan);

	public Plan getPlanByPlanId(Long planId);

	public CommonResponse deletePlanByPlanId(Long planId);

	public List<PlanModel> getCustomPlanData();
}
