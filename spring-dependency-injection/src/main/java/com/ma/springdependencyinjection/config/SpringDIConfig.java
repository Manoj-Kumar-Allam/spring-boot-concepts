package com.ma.springdependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.ma.springdependencyinjection.service.GreetingService;
import com.ma.springdependencyinjection.service.impl.GreetingServiceFactory;

@Configuration
public class SpringDIConfig {
	
	@Bean
	GreetingServiceFactory getGreetingServiceFactory() {
		return new GreetingServiceFactory();
	}
	
	@Bean
	@Primary
	@Profile({"EN"})
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("EN"); 
	}
	
	@Bean
	@Primary
	@Profile({"ES"})
	GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("ES"); 
	}
	
	@Bean
	@Primary
	@Profile({"DE"})
	GreetingService germanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("DE"); 
	}
}
