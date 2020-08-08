package com.xworkz.overriding;

public class VegiTester {

	public static void main(String[] args) {
		Vege vegi = new Vege();
		vegi.cusineType = "Indian";
//		vegi.quantity = 200;
		
		System.out.println("quantity:" +vegi.quantity);
		
		vegi.cooking();
		vegi.vegimethod();
}

}
