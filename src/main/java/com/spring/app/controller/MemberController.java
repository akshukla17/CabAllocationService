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

import com.spring.app.exception.DropPointMissingException;
import com.spring.app.model.Member;
import com.spring.app.service.DropPointService;
import com.spring.app.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	private MemberService ms;
	@Autowired
	private DropPointService dropPointService;

	@RequestMapping(value = "/cas/register", method = RequestMethod.POST)
	public ResponseEntity<?> register(@RequestBody List<Member> listOfMember) {
		for (int i = 0; i < listOfMember.size(); i++) {
			Member m = listOfMember.get(i);

			if (dropPointService.pointAndDistance.containsKey(m.getDrop_point().toLowerCase())) {
				ms.addMember(m);
			} else {
				throw new DropPointMissingException(m.getDrop_point());
			}
		}
		return new ResponseEntity<>(org.springframework.http.HttpStatus.CREATED);
	}

	@RequestMapping(value = "/cas/{id}")
	public @ResponseBody Member fetchUser(@PathVariable String id) {
		return ms.fetchMember(id);
	}

	@RequestMapping(value = "/cas/all")
	public @ResponseBody List<Member> fetchAll() {
		return ms.fetchAll();
	}
}
