package com.luv2code.springdemo;

/**
 * @author Jason
 *
 */
public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object 
		System.out.println(theCoach.getDailyWorkOut());
	}

}