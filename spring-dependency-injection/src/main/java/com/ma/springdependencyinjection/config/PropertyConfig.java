package com.ma.springdependencyinjection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.ma.springdependencyinjection.examplebeans.FakeDataSource;
import com.ma.springdependencyinjection.examplebeans.FakeJMSBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
	//@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
	
	@Autowired
	Environment env;
	
	@Value("${ma.user}")
	String user;
	
	@Value("${ma.password}")
	String password;
	
	@Value("${ma.dburl}")
	String dbUrl;
	
	@Value("${jms.user}")
	String jmsUser;
	
	@Value("${jms.password}")
	String jmsPassword;
	
	@Value("${jms.url}")
	String jmsUrl;
	
	@Bean
	public FakeDataSource prepareFakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(env.getProperty("user.name"));
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(dbUrl);
		return fakeDataSource;
	}
	
	@Bean
	public FakeJMSBroker prepareFakeJMSBroker() {
		FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
		fakeJMSBroker.setUser(jmsUser);
		fakeJMSBroker.setPassword(jmsPassword);
		fakeJMSBroker.setUrl(jmsUrl);
		return fakeJMSBroker;
	}
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}

