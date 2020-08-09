package com.xworkz.abstractclass;

public abstract class RBIBank {

	abstract void openacc(); // if abstarct just declare
	abstract void loan(); //sysou shold be in childcl
		
	void deposit(int amount) {
		System.out.println("deposit amt :" +amount);
	}
	
	void withdraw(int amount) {
		System.out.println("withdraw: " + amount);
	}
}
