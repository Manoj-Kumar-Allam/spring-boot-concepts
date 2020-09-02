package com.ma.springdependencyinjection.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ma.springdependencyinjection.service.GreetingService;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
	
	@Override
	public String getGreetings() {
		return "Hello World - Primary Bean";
	}
}
