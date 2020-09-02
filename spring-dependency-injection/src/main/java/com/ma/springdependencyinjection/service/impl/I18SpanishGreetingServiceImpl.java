package com.ma.springdependencyinjection.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.ma.springdependencyinjection.service.GreetingService;

@Profile(value = "ES")
@Service(value = "i18nService")
public class I18SpanishGreetingServiceImpl implements GreetingService {

	@Override
	public String getGreetings() {
		return "Hola Mundo - ES";
	}

}
