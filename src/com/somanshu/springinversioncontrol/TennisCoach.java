package com.somanshu.springinversioncontrol;

public class TennisCoach implements Coach {

	private HappyFortuneService happyfortuneservice;
	public TennisCoach(HappyFortuneService var)
	{
		happyfortuneservice=var;
	}
	
	@Override
	public String getInstruction() {
		// TODO Auto-generated method stub
		return "Play 100 min  everyday!";
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return happyfortuneservice.getMsg();
	}

}
