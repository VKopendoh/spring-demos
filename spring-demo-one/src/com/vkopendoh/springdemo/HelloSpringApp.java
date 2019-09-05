package com.vkopendoh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {	
		// load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container (aka application context)
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods from the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();
	}

}
