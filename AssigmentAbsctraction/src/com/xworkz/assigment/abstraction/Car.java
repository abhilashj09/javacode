package com.xworkz.assigment.abstraction;

public abstract class Car {

	abstract void applyaccelation();
	abstract void applybreaks();
	
	void turnright() {
		System.out.println("steer right");
	}
	
	void turnleft() {
		System.out.println("steer left");
	}
	
}
