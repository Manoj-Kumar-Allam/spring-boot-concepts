package com.ma.componentscan;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedServiceImpl implements GreetingService {
	
	@Override
	public String getGreetings() {
		return "Hello World - Setter";
	}
}
