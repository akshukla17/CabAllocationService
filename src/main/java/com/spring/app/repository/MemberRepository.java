package com.spring.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.app.model.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}
