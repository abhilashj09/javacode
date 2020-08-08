package com.xworkz.updowncasting;

public class Tester {

	public static void main(String[] args) {

		Transpoort t = new Transpoort();

		System.out.println("value of a:" + t.a);

		RoadwayTransport rd = new RoadwayTransport();
		System.out.println("in childclass:" + rd.a);
		System.out.println("in childclass:" + rd.b);

		rd.travelling(); // child class

		rd.road(); // child class

		Transpoort ct = new RoadwayTransport(); // upcast

		System.out.println("the value of during:" + ct.a);

		ct.travelling();
		

		RoadwayTransport rt = (RoadwayTransport) new Transpoort();// downcas
//		  rt.a = 100 ;
//		  rt.travelling();

		rt.b = 10;
		rt.road();
		
		
		
	}
       
       }

