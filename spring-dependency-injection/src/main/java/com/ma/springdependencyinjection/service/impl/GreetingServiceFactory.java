package com.ma.springdependencyinjection.service.impl;

import com.ma.springdependencyinjection.service.GreetingService;

public class GreetingServiceFactory {
	
	public GreetingService createGreetingService(String lang) {
		
		switch(lang) {
			case "EN":
				return new PrimaryGreetingService();
			case "DE":
				return new I18GermanGreetingServiceImpl();
			case "ES":
				return new I18SpanishGreetingServiceImpl();
			default:
				return new PrimaryGreetingService();
		}
	}
	
	
}
