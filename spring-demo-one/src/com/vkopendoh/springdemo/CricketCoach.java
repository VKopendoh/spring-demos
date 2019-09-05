package com.vkopendoh.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAdress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}
	
	

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}


	public void setTeam(String team) {
		this.team = team;
	}

	

	public String getEmailAdress() {
		return emailAdress;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}



}
