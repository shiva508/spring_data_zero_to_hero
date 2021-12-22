package com.pool.model.associations.onetomany.bidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TASK_ID")
	private Long taskId;
	private String taskDescription;
	private String why;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SCHEDULE_ID")
	@JsonIgnore
	private Schedule schedule;

	public Task() {

	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getWhy() {
		return why;
	}

	public void setWhy(String why) {
		this.why = why;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

}
