package com.pool.model;

import java.util.Date;

public class CommonResponse {
	private String messageName;
	private Date timeStamp;
	private String statusCode;

	public CommonResponse() {

	}

	public String getMessageName() {
		return messageName;
	}

	public CommonResponse setMessageName(String messageName) {
		this.messageName = messageName;
		return this;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public CommonResponse setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
		return this;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public CommonResponse setStatusCode(String statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	@Override
	public String toString() {
		return "CommonResponse [messageName=" + messageName + ", timeStamp=" + timeStamp + "]";
	}

}
