package com.pool.domine;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "SCAN")
@Entity
public class Scan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SCAN_ID")
	private Long scanId;
	private String scanType;
	private String scanLocation;
	private Date createdDate;

	public Scan() {

	}

	public Long getScanId() {
		return scanId;
	}

	public Scan setScanId(Long scanId) {
		this.scanId = scanId;
		return this;
	}

	public String getScanType() {
		return scanType;
	}

	public Scan setScanType(String scanType) {
		this.scanType = scanType;
		return this;
	}

	public String getScanLocation() {
		return scanLocation;
	}

	public Scan setScanLocation(String scanLocation) {
		this.scanLocation = scanLocation;
		return this;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Scan setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	@Override
	public String toString() {
		return "Scan [scanId=" + scanId + ", scanType=" + scanType + ", scanLocation=" + scanLocation + ", createdDate="
				+ createdDate + "]";
	}

}
