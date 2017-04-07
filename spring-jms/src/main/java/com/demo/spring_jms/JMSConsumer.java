package com.demo.spring_jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class JMSConsumer {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-jms.xml");
		JmsTemplate jms = (JmsTemplate) ctx.getBean("jmsTemplate");
		TextMessage tm = (TextMessage) jms.receive("jndiqueue.test1");
		try {
			System.out.println("The Message : " + tm.getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
