package com.demo.spring;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogger {
	Logger logger = Logger.getLogger("demo");
	
	@Before("execution(* com.demo.spring.Concat.doConcat(..))")
	public void logBefore(){
		logger.info("Before doConcat method is called..");
	}
	
	@After("execution(* com.demo.spring.Concat.doConcat(..))")
	public void logAfter(){
		logger.info("After doConcat method is called..");
	}
}
