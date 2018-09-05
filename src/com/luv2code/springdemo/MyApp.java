package com.luv2code.springdemo;

/**
 * @author Jason
 *
 */
public class MyApp {

	public static void main(String[] args) {
		
		HappyFortuneService fortuneService = new HappyFortuneService();
		
		// create the object
		Coach theCoach = new TrackCoach(fortuneService);
		
		// use the object 
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
	}

}