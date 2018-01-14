package com.spring.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.model.TeamMember;
import com.spring.app.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memRepo;

	public void addMember(TeamMember m) {
		memRepo.save(m);
	}
	
	public TeamMember fetchMember(String id) {
		return memRepo.findOne(id);
	}

	public List<TeamMember> fetchAll() {
		return (List<TeamMember>) memRepo.findAll();
	}
	

}
