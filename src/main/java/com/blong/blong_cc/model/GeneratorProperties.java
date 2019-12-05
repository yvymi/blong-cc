package com.blong.blong_cc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:config.properties")
public class GeneratorProperties {

	@Value("${numberPhoneNumber}")
	private String phoneNumber;
	
	@Value("${numberCustomer}")
	private String numberCustomer;

	public GeneratorProperties() {
		
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNumberCustomer() {
		return this.numberCustomer;
	}

	public void setNumberCustomer(String numberCustomer) {
		this.numberCustomer = numberCustomer;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	
}
