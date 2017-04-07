package com.demo.spring_jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class JMSProducer {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"amq-spring-jms.xml");
		JmsTemplate jms = (JmsTemplate) ctx.getBean("jmsTemplate");
		jms.send("myQueue", new MessageCreator() {
			
			public Message createMessage(Session arg0) throws JMSException {
				TextMessage msg = arg0.createTextMessage();
				msg.setText("From spring remote");
				return msg;
				
			}
		});

		System.out.println("Message sent..");
	}

}
