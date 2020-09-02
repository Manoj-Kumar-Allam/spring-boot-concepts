package com.ma.springdependencyinjection.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.ma.springdependencyinjection.service.GreetingService;

@Profile({"EN", "default"})
@Service(value = "i18nService")
public class I18EnglishGreetingServiceImpl implements GreetingService {

	@Override
	public String getGreetings() {
		return "Hello World -EN";
	}

}
