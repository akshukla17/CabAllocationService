package com.spring.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "team_member")
public class Member {

	@Id
	private String team_member_id;
	private String gender;
	private String drop_point;


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDrop_point() {
		return drop_point;
	}

	public void setDrop_point(String drop_point) {
		this.drop_point = drop_point;
	}

	public String getTeam_member_id() {
		return team_member_id;
	}

	public void setTeam_member_id(String team_member_id) {
		this.team_member_id = team_member_id;
	}

}
