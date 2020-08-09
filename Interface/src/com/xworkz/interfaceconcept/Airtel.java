package com.xworkz.interfaceconcept;

public class Airtel implements InternetProvider {

	@Override
	public void speed() {
	
		System.out.println("speed is :10");
		
	}

	@Override
	public void connection() {
		System.out.println("connection is :  fibernet");
		
	}

	

	
}
