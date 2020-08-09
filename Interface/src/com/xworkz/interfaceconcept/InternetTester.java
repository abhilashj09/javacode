package com.xworkz.interfaceconcept;

public class InternetTester {

	public static void main(String[] args) {
		
		InternetProvider n = new Airtel();
		
		n.connection();
		n.speed();
		
	}

}
