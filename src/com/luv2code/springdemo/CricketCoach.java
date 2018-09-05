package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	// create a no arg-constructor
	public CricketCoach() {
		//System.out.println("CricketCoach: inside the no-arg constructor");
	}
	
	// create setter method
	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("CricketCoach: inside the setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		//System.out.println("CricketCoach: inside the setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		//System.out.println("CricketCoach: inside the setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice bowling";
	}
	
	// create getter method
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyFortune() {
		return "From Cricket: " + fortuneService.getFortune();
	}

}
