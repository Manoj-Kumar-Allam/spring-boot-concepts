package com.ma.springdependencyinjection.service.impl;

import org.springframework.stereotype.Service;

import com.ma.springdependencyinjection.service.GreetingService;

@Service
public class PropertyInjectedServiceImpl implements GreetingService {
	
	@Override
	public String getGreetings() {
		return "Hello World - Property ";
	}
}
