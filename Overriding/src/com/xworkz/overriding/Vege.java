package com.xworkz.overriding;

public class Vege extends Food {

	String cusineType;
	int quantity = 500;
	void vegimethod() {
		System.out.println("from vegimethod");
	}

	@Override

	public void cooking() {
		System.out.println("cooking only veg");
	}
}
