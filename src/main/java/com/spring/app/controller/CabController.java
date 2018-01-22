package com.spring.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.model.Cab;
import com.spring.app.sevice.CabService;

@RestController
public class CabController {

	@Autowired
	private CabService cabService;

	@RequestMapping(value = "/cas/cabs", method = RequestMethod.POST)
	public ResponseEntity<?> addCab(@RequestBody List<Cab> listOfCab) {
		for (int i = 0; i < listOfCab.size(); i++) {
			Cab c = listOfCab.get(i);
			cabService.addCab(c);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
