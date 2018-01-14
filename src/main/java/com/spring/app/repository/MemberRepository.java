package com.spring.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.app.model.TeamMember;

public interface MemberRepository extends CrudRepository<TeamMember, String> {

}
