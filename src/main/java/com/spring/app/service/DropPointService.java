package com.spring.app.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class DropPointService {

	public Map<String, String[]> pointAndDistance = new LinkedHashMap<>();
	
	public void storeLocation(JSONObject obj) {
		for (int i = 0; i < obj.names().length(); i++) {
			System.out.println("key: " + obj.names().get(i) + " ,value: " + obj.get(obj.names().getString(i)));
			String s = (String) obj.get(obj.names().getString(i));
			String[] ss = s.split(",");
			pointAndDistance.put(((String) obj.names().get(i)).toLowerCase(), ss);
		}
		
	}

}
