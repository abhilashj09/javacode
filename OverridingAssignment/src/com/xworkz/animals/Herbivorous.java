package com.xworkz.animals;

public class Herbivorous extends Animals {

	String animalType;
	int legs = 4;
	
	void carniimethod() {
		System.out.println("from carniimethod");
	}

	@Override

	public void running() {
		System.out.println("herbivours running");
	}

}
