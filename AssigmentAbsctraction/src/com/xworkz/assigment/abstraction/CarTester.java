package com.xworkz.assigment.abstraction;

public class CarTester {

	public static void main(String[] args) {
		
		BMW car = new BMW();
		
		car.turnleft();
		car.applyaccelation();
		car.applybreaks();
		car.turnright();
		
		Audi car1 = new Audi();
		
		car1.turnleft();
		car1.applyaccelation();
		car1.applybreaks();
		car1.turnright();
	}

}
