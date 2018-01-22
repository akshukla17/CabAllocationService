package com.spring.app.exception;

public class DropPointMissingException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DropPointMissingException(String dropPoint) {
		super("Requested drop point " + dropPoint
				+ " is not available right now, kindly contact CAS team ");
	}
}
