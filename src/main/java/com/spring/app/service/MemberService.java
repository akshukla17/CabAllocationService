package com.spring.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.model.Member;
import com.spring.app.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memRepo;

	public void addMember(Member m) {
		memRepo.save(m);
	}
	
	public Member fetchMember(String id) {
		return memRepo.findOne(id);
	}

	public List<Member> fetchAll() {
		return (List<Member>) memRepo.findAll();
	}
	

}
