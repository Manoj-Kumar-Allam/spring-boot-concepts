package com.ma.springdependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ma.springdependencyinjection.service.GreetingService;

@Controller
public class MyController {
	
	@Autowired
	GreetingService greetingService;

	public String sayHello() {
		System.out.println("Hello World");
		System.out.println(greetingService.getGreetings());
		return "Hey Folks";
	}
}
