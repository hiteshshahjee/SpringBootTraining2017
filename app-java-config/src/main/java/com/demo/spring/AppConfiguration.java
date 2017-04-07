package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.demo.spring"})
public class AppConfiguration {

	@Bean
	public DecoratedWriter decoratedWriter(){
		DecoratedWriter writer = new DecoratedWriter();
		return writer;
	}
}
