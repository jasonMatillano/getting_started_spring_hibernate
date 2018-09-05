package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		//System.out.println("BaseballCoach: inside the constructor");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Spend 30 min in batting practice";
	}

	@Override
	public String getDailyFortune() {
		return "From Baseball: " + fortuneService.getFortune();
	}
	
}
