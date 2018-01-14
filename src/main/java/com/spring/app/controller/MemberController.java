package com.spring.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.model.TeamMember;
import com.spring.app.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	private MemberService ms;

	@RequestMapping(value = "/cas/register", method = RequestMethod.POST)
	public ResponseEntity<?> register(@RequestBody List<TeamMember> listOfMember) {
		for(int i=0;i<listOfMember.size();i++) {
			TeamMember m=listOfMember.get(i);
			ms.addMember(m);
		}
		return new ResponseEntity<>(org.springframework.http.HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/cas/{id}")
	public @ResponseBody TeamMember fetchUser(@PathVariable String id){
		return ms.fetchMember(id);
	}
	
	@RequestMapping(value="/cas/all")
	public @ResponseBody List<TeamMember> fetchAll(){
		return ms.fetchAll();
	}
}
