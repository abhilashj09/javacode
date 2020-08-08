package com.xworkz.overriding;

public class NonVeg extends Food{
	
	String cusineType;
	int quantity = 500;
	
	void vegimethod() {
		System.out.println("from non vegimethod");
	}

	@Override

	public void cooking() {
		System.out.println("cooking only non veg");
	}

}
