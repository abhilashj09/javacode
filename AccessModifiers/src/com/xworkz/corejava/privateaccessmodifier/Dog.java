package com.xworkz.corejava.privateaccessmodifier;

public class Dog {
	//instance varaiable
private String breed;
protected String color;
int age;
public boolean isMale;

//construc
private Dog() {
	System.out.println("creating object of dog");
}
Dog(String inBreed){
	System.out.println("creating using one para");
}
public Dog(String inBreed , int inAge) {
	System.out.println("creating object of dog using para");
}

//methos
private void eating() {
	System.out.println("dog is eating");
}
void barking() {
	breed = "Julie";
	System.out.println("is barking");
}
public void running() {
	System.out.println("running");
}
public static void mian(String[] args) {
	Dog inhouseDog = new Dog();
	inhouseDog.breed = "julie";
	inhouseDog.age= 3;
	
	inhouseDog.eating();
	inhouseDog.barking();
	
}
}

