package com.spring.app.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DropController {
	
	@RequestMapping(value="/cas/drop_points",method=RequestMethod.POST)
	public ResponseEntity<?> addDropPoint(HttpServletRequest request){
		// to do\
		
		if ("POST".equalsIgnoreCase(request.getMethod())) 
		{
		  try {
			String  test = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
			JSONObject obj=new JSONObject(test);
			System.out.println("************* \n");
			Map<String,String[]> pointAndDistance=new HashMap<>();
			for(int i=0;i<obj.names().length();i++) {
				System.out.println("key: "+obj.names().get(i)+" ,value: "+obj.get(obj.names().getString(i)));
				String s=(String) obj.get(obj.names().getString(i));
				String[] ss=s.split(",");
				pointAndDistance.put((String)obj.names().get(i),ss );
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
