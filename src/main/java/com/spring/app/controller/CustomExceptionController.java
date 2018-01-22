package com.spring.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.app.exception.DropPointMissingException;
import com.spring.app.model.ErrorResponse;

@ControllerAdvice
public class CustomExceptionController extends RuntimeException {
	private static final long serialVersionUID = 1L;


	@ExceptionHandler(DropPointMissingException.class)
	public ResponseEntity<ErrorResponse> missingDropPoint(DropPointMissingException ex) {
		ErrorResponse e = new ErrorResponse(ex.getMessage());
		return new ResponseEntity<ErrorResponse>(e, HttpStatus.BAD_REQUEST);
	}

}
