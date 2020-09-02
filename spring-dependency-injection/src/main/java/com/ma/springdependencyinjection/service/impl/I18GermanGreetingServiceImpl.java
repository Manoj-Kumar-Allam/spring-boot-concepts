package com.ma.springdependencyinjection.service.impl;

import com.ma.springdependencyinjection.service.GreetingService;

public class I18GermanGreetingServiceImpl implements GreetingService {
	
	@Override
	public String getGreetings() {
		return "German Greetings";
	}

}
