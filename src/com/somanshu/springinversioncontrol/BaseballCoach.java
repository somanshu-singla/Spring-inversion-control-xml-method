package com.somanshu.springinversioncontrol;

public class BaseballCoach implements Coach {

	private HappyFortuneService happyfortuneservice;
	public BaseballCoach(HappyFortuneService var)
	{
		happyfortuneservice=var;
	}
	@Override
	public String getInstruction() {
		// TODO Auto-generated method stub
		return "Play 30 min daily!";
	}
	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return happyfortuneservice.getMsg();
	}

}
