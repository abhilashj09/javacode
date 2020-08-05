package com.xworkz.staticmembers;

public class Emp {

	int empid;
	String name;
	static String office = "xworks"; //global variable
	
	static {
		
	}
	
	public Emp(int empid, String name, String office) {
		
		this.empid = empid;
		this.name = name;
		
	}
	
	static void initCollege() {
		office ="xworks";
	}
	void display() {
		System.out.println("emp:" +empid);
		System.out.println("name: "  +name );
		System.out.println("office: " +office );
	}
}
