package com.pool.repository.associations.onetoone.unidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ReligionDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RELIGION_DETAILS_ID")
	private Long religionDetailsId;
	private String founder;
	private String existingSince;
	private String holiBookName;

	public ReligionDetails() {

	}

	public Long getReligionDetailsId() {
		return religionDetailsId;
	}

	public void setReligionDetailsId(Long religionDetailsId) {
		this.religionDetailsId = religionDetailsId;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getExistingSince() {
		return existingSince;
	}

	public void setExistingSince(String existingSince) {
		this.existingSince = existingSince;
	}

	public String getHoliBookName() {
		return holiBookName;
	}

	public void setHoliBookName(String holiBookName) {
		this.holiBookName = holiBookName;
	}

}
