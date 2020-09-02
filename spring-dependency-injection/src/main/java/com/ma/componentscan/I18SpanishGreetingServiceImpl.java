package com.ma.componentscan;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "ES")
@Service(value = "i18nService")
public class I18SpanishGreetingServiceImpl implements GreetingService {

	@Override
	public String getGreetings() {
		return "Hola Mundo - ES";
	}

}
