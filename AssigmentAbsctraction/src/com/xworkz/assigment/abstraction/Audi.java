package com.xworkz.assigment.abstraction;

public class Audi extends Car {

	@Override
	void applyaccelation() {
		System.out.println("Engine start ");
		
	}

	@Override
	void applybreaks() {
		
		System.out.println("Caution time to break");
	}

}
