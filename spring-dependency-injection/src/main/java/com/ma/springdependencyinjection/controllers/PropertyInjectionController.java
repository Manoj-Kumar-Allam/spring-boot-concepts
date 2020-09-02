package com.ma.springdependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ma.springdependencyinjection.service.GreetingService;

@Controller
public class PropertyInjectionController {

	@Autowired
	@Qualifier("propertyInjectedServiceImpl")
	GreetingService greetingService;

	public void printGretting() {
		System.out.println(greetingService.getGreetings());
	}

}
