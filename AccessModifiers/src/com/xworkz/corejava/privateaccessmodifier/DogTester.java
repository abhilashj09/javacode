package com.xworkz.corejava.privateaccessmodifier;

public class DogTester {

	public static void main(String[] args) {
	//Cannot access private member of dog class outside
//can access default memebrs outside the class		
		
		Dog outsideDog = new Dog("German" , 5);
//		dog1.breed = "German";
		
		outsideDog.age = 5; //default member of dog
		outsideDog.color = "brown"; // protected mem of dog
		outsideDog.isMale = true;// public membr of dog
		
//		System.out.println("dog breed:" +dog1.breed);
		System.out.println("Dog age:" +outsideDog.age);
		
//		outsideDog.dog1.eating();
		outsideDog.barking();
	}
}
