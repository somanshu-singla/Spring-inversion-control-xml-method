package com.somanshu.springinversioncontrol;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola! I'm gonna do inversion control!");
		Coach coach = new BaseballCoach();
		System.out.println(coach.getInstruction());
		Coach coach2 = new TennisCoach();
	}

}
