package com.xworkz.overriding;

public class Food {

//	access modifier in priority wise in overriding concept
	
	int quantity = 200;
	
	public void cooking() {
		System.out.println("cooking method from food");
	}
	
	static void foodMethod() {
		System.out.println("static method");
	}
}
