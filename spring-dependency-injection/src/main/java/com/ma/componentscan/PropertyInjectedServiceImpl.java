package com.ma.componentscan;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedServiceImpl implements GreetingService {
	
	@Override
	public String getGreetings() {
		return "Hello World - Property ";
	}
}
