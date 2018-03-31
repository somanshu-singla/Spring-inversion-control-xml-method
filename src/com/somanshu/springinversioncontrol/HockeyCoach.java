package com.somanshu.springinversioncontrol;

public class HockeyCoach implements Coach {

	private HappyFortuneService fortuneservice;
	
	public void setFortuneservice(HappyFortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getInstruction() {
		// TODO Auto-generated method stub
		return "I was the hockey team caption in 8th grade!";
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return fortuneservice.getMsg();
	}

}
