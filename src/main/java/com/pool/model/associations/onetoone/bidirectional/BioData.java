package com.pool.model.associations.onetoone.bidirectional;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class BioData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bioDataId;
	private String aspiration;
	private String quote;
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_ID")
	private Student student;

	public BioData() {

	}

	public Integer getBioDataId() {
		return bioDataId;
	}

	public void setBioDataId(Integer bioDataId) {
		this.bioDataId = bioDataId;
	}

	public String getAspiration() {
		return aspiration;
	}

	public void setAspiration(String aspiration) {
		this.aspiration = aspiration;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
