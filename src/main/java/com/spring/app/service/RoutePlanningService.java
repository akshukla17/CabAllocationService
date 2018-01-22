package com.spring.app.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.app.model.Member;

@Service
public class RoutePlanningService {

	@Autowired
	MemberService memberService;
	@Autowired
	DropPointService dropPointService;

	public ResponseEntity<?> getRoutePlan() {
		calculateTotalRouteCost();
		return null;
	}

	/**
	 * this will calculate total cost of route
	 */
	private void calculateTotalRouteCost() {
		List<Member> memberList = memberService.fetchAll();
		Map<String, Integer> genderWithDistacneFromHQ = new HashMap<>();
		for (int i = 0; i < memberList.size(); i++) {
			String gender = memberList.get(i).getGender();
			String point = memberList.get(i).getDrop_point();
			char ch = point.charAt(point.length() - 1);
			int value = getRelativePosition(ch);
			String[] arr = dropPointService.pointAndDistance.get("target_headquarter");
			String distance = arr[value];
			System.out.println(point + "from the head quater is " + distance);
			genderWithDistacneFromHQ.put(gender, Integer.parseInt(distance));
		}
	}

	public int getRelativePosition(char c) {
		int temp = (int) c;
		int temp_integer = 65; // for lower case
		if(temp<=90 & temp>=65)
			return temp-temp_integer;
		else
			return -1;

	}

	public int travelCost() {

		return 0;
	}

}
