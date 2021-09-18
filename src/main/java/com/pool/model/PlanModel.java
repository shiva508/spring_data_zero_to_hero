package com.pool.model;

public class PlanModel {
	private String planTitleModel;
	private String planDescriptionModel;

	public PlanModel(String planTitleModel, String planDescriptionModel) {
		super();
		this.planTitleModel = planTitleModel;
		this.planDescriptionModel = planDescriptionModel;
	}

	public String getPlanTitleModel() {
		return planTitleModel;
	}

	public void setPlanTitleModel(String planTitleModel) {
		this.planTitleModel = planTitleModel;
	}

	public String getPlanDescriptionModel() {
		return planDescriptionModel;
	}

	public void setPlanDescriptionModel(String planDescriptionModel) {
		this.planDescriptionModel = planDescriptionModel;
	}

}
