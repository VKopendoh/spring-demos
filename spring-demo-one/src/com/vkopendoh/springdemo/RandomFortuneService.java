package com.vkopendoh.springdemo;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"Super luck!", "Just luck", "Not your day(("};
	@Override
	public String getFortune() {		
		return fortunes[(int)(Math.random() * 3)];
	}

}
