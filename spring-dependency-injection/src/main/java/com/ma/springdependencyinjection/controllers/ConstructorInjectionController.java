package com.ma.springdependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ma.springdependencyinjection.service.GreetingService;

@Controller
public class ConstructorInjectionController {
	
	public final GreetingService greetingService;
	
	@Autowired
	public ConstructorInjectionController(@Qualifier("constructorInjectedServiceImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public void printGretting() {
		System.out.println(greetingService.getGreetings());
	}
	
}
