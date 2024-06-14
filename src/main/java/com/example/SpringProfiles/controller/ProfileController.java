package com.example.SpringProfiles.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
	
	// obtaining value from properties file
	@Value("${message}")
	private String msg;
	
	
	//passing the value to index.jsp
	@GetMapping("/profile")
	public String getProfile(Map<String,String> m) {
		m.put("message", msg);
		return "index";
	}

}
