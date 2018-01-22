package com.spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.service.RoutePlanningService;

@RestController
public class RoutePlanningController {

	@Autowired
	private RoutePlanningService routePlanService;
	@RequestMapping(value="/cas/route_plan")
	public ResponseEntity<?> getRoutePlan(){
		return routePlanService.getRoutePlan();
		
	}
}
