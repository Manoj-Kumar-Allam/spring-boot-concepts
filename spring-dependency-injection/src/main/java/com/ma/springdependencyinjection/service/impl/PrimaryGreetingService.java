package com.ma.springdependencyinjection.service.impl;

import com.ma.springdependencyinjection.service.GreetingService;

public class PrimaryGreetingService implements GreetingService {

	@Override
	public String getGreetings() {
		return "English Greetings";
	}
}
