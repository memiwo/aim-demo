package com.aim.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aim.service.GreetingService;

@RestController
public class GreetingController {
	
	public static final String GREETINGS = "/greetings";
	
	private GreetingService greetingService;
	
	@Autowired
	public GreetingController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
	@RequestMapping(value = GREETINGS)
	public String greet(@RequestParam(value = "name", defaultValue = "",  required = false) String name){
						
		return this.greetingService.getMessage(name);
	}
	
	

}
