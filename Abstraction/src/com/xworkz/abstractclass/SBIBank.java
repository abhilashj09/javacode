package com.xworkz.abstractclass;

public abstract  class SBIBank extends RBIBank {

	@Override
	void openacc() {
		System.out.println("things required are :");
		System.out.println("pan, adhar,photo");
	}

	
}
