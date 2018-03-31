/**
 * 
 */
package com.somanshu.springinversioncontrol;

/**
 * @author User
 *
 */
public class CricketCoach implements Coach {

	/* (non-Javadoc)
	 * @see com.somanshu.springinversioncontrol.Coach#getInstruction()
	 */
	private HappyFortuneService happyfortuneservice;
	public CricketCoach(HappyFortuneService var)
	{
		happyfortuneservice=var;
	}
	@Override
	public String getInstruction() {
		// TODO Auto-generated method stub
		return "I like playing cricket , so I will decide on my own!";
	}

}
