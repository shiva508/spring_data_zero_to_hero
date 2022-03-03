package com.pool.controller;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pool.domine.Plan;
import com.pool.model.CommonResponse;
import com.pool.model.PlanModel;
import com.pool.service.plan.PlanService;
import com.pool.util.InputValidatorUtil;

@RestController
public class PlanController {
	@Autowired
	private PlanService planService;
	@Autowired
	private InputValidatorUtil inputValidatorUtil;

	@PostMapping("/saveplan")
	public ResponseEntity<?> savePlan(@Valid @RequestBody Plan plan, BindingResult result) {
		ResponseEntity<?> errorResponse = inputValidatorUtil.validationResponseExtractorResult(result);
		if (errorResponse != null)
			return errorResponse;
		Plan savedPlan = planService.savePlan(plan);
		return new ResponseEntity<>(savedPlan, HttpStatus.CREATED);
	}

	@GetMapping("/allplans")
	public ResponseEntity<?> getAllPlans() {
		List<Plan> plans = planService.getAllPlans();
		return new ResponseEntity<>(plans, HttpStatus.OK);
	}

	@PutMapping("/updateplan")
	public ResponseEntity<?> updatePlan(@RequestBody Plan plan) {
		Plan updatedPlan = planService.updatePlan(plan);
		return new ResponseEntity<>(updatedPlan, HttpStatus.OK);
	}

	@GetMapping("/plan/{planId}")
	public ResponseEntity<?> getPlanByPlanId(@PathVariable("planId") Integer planId) {
		Plan paln = planService.getPlanByPlanId(planId);
		return new ResponseEntity<>(paln, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{planId}")
	public ResponseEntity<?> deletePlanByPlanId(@PathVariable("planId") Integer planId) {
		CommonResponse commonResponse = planService.deletePlanByPlanId(planId);
		return new ResponseEntity<>(commonResponse, HttpStatus.OK);
	}

	@GetMapping("/custumdata")
	public ResponseEntity<?> getCustomPlanData() {
		List<PlanModel> streamPlan = planService.getCustomPlanData();
		return new ResponseEntity<>(streamPlan, HttpStatus.OK);
	}
	
	@GetMapping("/asyncTest")
	public void data() {
		List<String> asgasga=getlaData();
		List<String> asgasga2=getlaData2();
	}


	@Async("executor")
	private List<String> getlaData2() {
		
		return Arrays.asList("1");
	}
	@Async("executor")
	private List<String> getlaData() {
		
		return null;
	}
	
	
	
}
