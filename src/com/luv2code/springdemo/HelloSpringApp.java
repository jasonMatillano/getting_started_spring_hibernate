package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container 
		Coach myCoach = context.getBean("myCoachBean", Coach.class);
		
		// call methods on the bean
		System.out.println(myCoach.getDailyWorkOut());
		System.out.println(myCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
