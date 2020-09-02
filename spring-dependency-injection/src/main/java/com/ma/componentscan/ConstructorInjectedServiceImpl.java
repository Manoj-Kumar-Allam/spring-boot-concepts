package com.ma.componentscan;

import org.springframework.stereotype.Service;

@Service(value = "constructorInjectedServiceImpl")
public class ConstructorInjectedServiceImpl implements GreetingService {

	@Override
	public String getGreetings() {
		return "Hello World - Constructor ";
	}

}
