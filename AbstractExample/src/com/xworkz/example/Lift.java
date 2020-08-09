package com.xworkz.example;

public abstract class Lift {

	abstract void press1();
	abstract void press2();
	
	void stop() {
		System.out.println("lift stopped");
	}
    void move() {
			System.out.println("lift is moving");
		}
	
}
