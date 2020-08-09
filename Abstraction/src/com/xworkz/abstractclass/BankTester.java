package com.xworkz.abstractclass;

public class BankTester  {

	public static void main(String[] args) {
		
//		SBIBank sbi = new SBIBank(); dont work because of abstract
		
		RBIBank rbi = new JaysnagarSBIBank(); //upcast
		
		rbi.openacc();
		
		rbi.deposit(1000);
		
		rbi.loan();
	}

}
