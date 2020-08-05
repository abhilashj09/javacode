package com.xworkz.blocks;

public class Clip {

	String material;
	double price;
	//called during obj creatin just before constr
	{
		material = "metal" ;
	}
	
	Clip(String inputMaterial, double inputPrice){
		System.out.println("material: "+material +"price:"+price);
		
		material = inputMaterial;
		price =inputPrice;
		
	}
	
	void putClip() {
		System.out.println("putclip");
	}
	
	{
		price = 50.00;
	}
}
      
