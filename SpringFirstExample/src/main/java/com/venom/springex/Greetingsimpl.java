package com.venom.springex;

public class Greetingsimpl implements Greetings {

	@Override
	public void greet() {
		System.out.println("THis is evolution - Spring");
		System.out.println("Spring and its prime mode");
		
	}
	
	public Greetingsimpl() {
		System.out.println("Spring Bean Created Success");
	}

}
