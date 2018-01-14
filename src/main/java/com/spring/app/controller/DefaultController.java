package com.spring.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	@RequestMapping(value="/cas")
	public String cas() {
		return "Welcome to Cab Allocation Service";
	}
	
	@RequestMapping(value="/")
	public String defaultMethod() {
		return "this is a cab allocation service";
	}
}
