package com.xworkz.updowncasting;

public class RoadwayTransport extends Transpoort {

	int a;
	int b;

	@Override
	void travelling() {
		System.out.println("road way");

	}

	void road() {
		System.out.println("require road");
	}
}
