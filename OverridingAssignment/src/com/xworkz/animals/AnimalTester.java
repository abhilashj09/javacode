package com.xworkz.animals;

public class AnimalTester {

	public static void main(String[] args) {
		Carnivorous c = new Carnivorous();
		c.animalType = "Carnivours";
		c.legs = 4;
		
		c.running();
		c.carnimethod();

		
		Herbivorous h = new Herbivorous();
		h.animalType = "Herbivour";
		h.legs = 4;
		
		h.running();
		
		
	}

}
