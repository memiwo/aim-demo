package com.aim.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aim.service.GreetingService;

@RestController
public class GreetingController {
	
	private static final String GREETINGS = "/greetings";
	
	private GreetingService greetingService;
	
	public GreetingController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
	@GetMapping(GREETINGS)
	public String greet(@RequestParam(value = "name", defaultValue = "",  required = false) String name){
						
		return this.greetingService.getMessage(name);
	}
	
	

}
