package com.spring.app.controller;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.service.DropPointService;

@RestController
public class DropPointController {

	
	@Autowired
	DropPointService dropPointService;
	@RequestMapping(value = "/cas/drop_points", method = RequestMethod.POST)
	public ResponseEntity<?> addDropPoint(HttpServletRequest request) {
		// to do\

		
		if ("POST".equalsIgnoreCase(request.getMethod())) {
				try {
					String requestBody = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
					JSONObject obj = new JSONObject(requestBody);
					dropPointService.storeLocation(obj);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				


		}

		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
