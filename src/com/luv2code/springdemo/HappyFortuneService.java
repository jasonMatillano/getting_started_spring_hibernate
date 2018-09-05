package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		//System.out.println("HappyFortuneService: inside the getFortune() method");
		return "Today is your lucky day!";
	}

}
