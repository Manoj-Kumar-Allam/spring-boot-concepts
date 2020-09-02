package com.ma.componentscan;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service(value = "i18nService")
public class I18EnglishGreetingServiceImpl implements GreetingService {

	@Override
	public String getGreetings() {
		return "Hello World -EN";
	}

}
