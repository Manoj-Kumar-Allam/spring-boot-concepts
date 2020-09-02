package com.ma.componentscan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		System.out.println("I am LifeCycle Bean Constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("The Lifecycle Bean has it's properties set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("The Lifecycle Bean has destroyed");
	}
	
	@Override
	public void setBeanName(String name) {
		System.out.println("Beans Name is " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Beans factory has been set");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application Context has been set");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("The Post Construct annotated method has been called");
	}
	
	@PreDestroy
	public void postDestroy() {
		System.out.println("The Pre Destroy annotated method has been called");
	}
	
	public void beforeInit() {
		System.out.println("LifeCycle Demo bean before Initialization");
	}
	
	public void afterInit() {
		System.out.println("LifeCycle Demo bean After Initialization");
	}

}
