package com.xworkz.encap;

public class BankHacking {

	public static void main(String[] args) {
		
		Bank bank =new Bank("ICICI009");
		
//		bank.accNum ="ICIC009";
//		bank.balance = -1000;
		
//		bank .displayBalance(bank.acctNum);
		
		bank.deposit(-1000); //2000
		
		bank.displayBalance("ICICI009");
		

	}

}
