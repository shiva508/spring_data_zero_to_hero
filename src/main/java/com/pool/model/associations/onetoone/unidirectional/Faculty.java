package com.pool.model.associations.onetoone.unidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FACULTY_ID")
	private Integer facultyId;
	@Column(name = "FACULTY_NAME")
	private String facultyName;

	private String title;
	private String genre;
	private Double rating;
	private Double watchTime;
	private Integer releaseYear;

	public Faculty() {

	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getWatchTime() {
		return watchTime;
	}

	public void setWatchTime(Double watchTime) {
		this.watchTime = watchTime;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

}
