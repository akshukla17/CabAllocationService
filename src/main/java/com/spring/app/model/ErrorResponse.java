package com.spring.app.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorResponse {
	private String message;
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date timestamp;

	//default constructor
	public ErrorResponse() {}
	
	//parameterized constructor
	public ErrorResponse(String desc) {
		super();
		this.setMessage(desc);
		this.timestamp=new Date();
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
