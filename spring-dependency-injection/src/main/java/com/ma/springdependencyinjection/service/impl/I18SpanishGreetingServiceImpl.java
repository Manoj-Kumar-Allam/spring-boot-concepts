package com.ma.springdependencyinjection.service.impl;

import com.ma.springdependencyinjection.service.GreetingService;

public class I18SpanishGreetingServiceImpl implements GreetingService {

	@Override
	public String getGreetings() {
		return "Spanish Greetings";
	}

}
