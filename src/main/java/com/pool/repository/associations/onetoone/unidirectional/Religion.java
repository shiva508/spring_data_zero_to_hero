package com.pool.repository.associations.onetoone.unidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
public class Religion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RELIGION_ID")
	private Long religionId;
	private String religionName;

	@OneToOne
	@JoinColumn(name = "RELIGION_DETAILS_ID")
	private ReligionDetails religionDetails;

	public Religion() {

	}

	public Long getReligionId() {
		return religionId;
	}

	public void setReligionId(Long religionId) {
		this.religionId = religionId;
	}

	public String getReligionName() {
		return religionName;
	}

	public void setReligionName(String religionName) {
		this.religionName = religionName;
	}

	public ReligionDetails getReligionDetails() {
		return religionDetails;
	}

	public void setReligionDetails(ReligionDetails religionDetails) {
		this.religionDetails = religionDetails;
	}

}
