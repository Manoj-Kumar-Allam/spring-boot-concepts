package com.ma.springdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

import com.ma.springdependencyinjection.service.GreetingService;

@Controller
public class I18nController {
	
	private final GreetingService greetingService;

	public I18nController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.getGreetings();
	}
	
}
