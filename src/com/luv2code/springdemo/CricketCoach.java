package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// create a no arg-constructor
	public CricketCoach() {
		//System.out.println("CricketCoach: inside the no-arg constructor");
	}
	
	// create setter method
	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("CricketCoach: inside the setter method");
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkOut() {
		return "Practice bowling";
	}

	@Override
	public String getDailyFortune() {
		return "From Cricket: " + fortuneService.getFortune();
	}

}
