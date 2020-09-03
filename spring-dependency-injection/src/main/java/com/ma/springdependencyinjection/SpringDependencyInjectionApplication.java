package com.ma.springdependencyinjection;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ma.springdependencyinjection.controllers.ConstructorInjectionController;
import com.ma.springdependencyinjection.controllers.I18nController;
import com.ma.springdependencyinjection.controllers.MyController;
import com.ma.springdependencyinjection.controllers.PropertyInjectionController;
import com.ma.springdependencyinjection.controllers.SetterInjectionController;
import com.ma.springdependencyinjection.examplebeans.FakeDataSource;
import com.ma.springdependencyinjection.examplebeans.FakeJMSBroker;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.ma.componentscan", "com.ma.springdependencyinjection"})
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		
		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		
		System.out.println(i18nController.sayHello());
		
		MyController controller = (MyController) applicationContext.getBean("myController");
		
		controller.sayHello();
		
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) applicationContext.getBean("propertyInjectionController");
		
		propertyInjectionController.printGretting();
		
		SetterInjectionController setterInjectionController = (SetterInjectionController) applicationContext.getBean("setterInjectionController");
		
		setterInjectionController.printGretting();
		
		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) applicationContext.getBean("constructorInjectionController");
		constructorInjectionController.printGretting();
		
		FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		
		FakeJMSBroker fakeJMSBroker = applicationContext.getBean(FakeJMSBroker.class);
		System.out.println(fakeJMSBroker.getUser());
		
		Properties properties = System.getProperties();
		System.out.print(properties);
		
		
	}

}
