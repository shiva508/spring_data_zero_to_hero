package com.pool.domine;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Plan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long planId;
	private String planTitle;
	private String planDescription;
	private Date planCreatedDate;
	private Date planEndDate;
	public Plan() {
		
	}
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public String getPlanTitle() {
		return planTitle;
	}
	public void setPlanTitle(String planTitle) {
		this.planTitle = planTitle;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	public Date getPlanCreatedDate() {
		return planCreatedDate;
	}
	public void setPlanCreatedDate(Date planCreatedDate) {
		this.planCreatedDate = planCreatedDate;
	}
	public Date getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planTitle=" + planTitle + ", planDescription=" + planDescription
				+ ", planCreatedDate=" + planCreatedDate + ", planEndDate=" + planEndDate + "]";
	}
	
	
	

}
