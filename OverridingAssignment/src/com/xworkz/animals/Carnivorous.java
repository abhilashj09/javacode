package com.xworkz.animals;

public class Carnivorous extends Animals {

	String animalType;
	int legs = 4;
	void carnimethod() {
		System.out.println("from carnimethod");
	}

	@Override

	public void running() {
		System.out.println("cari running ");
	}

}
