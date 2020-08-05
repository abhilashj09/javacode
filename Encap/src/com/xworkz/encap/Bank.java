package com.xworkz.encap;

public class Bank {

	private String acctNum;
	private int balance = 10000;
	
	public  Bank (String inputAccNo) {
		acctNum = inputAccNo;
	}
	
	public void displayBalance(String acctno) {
		System.out.println("Balance for acct " + acctno +" is: " + balance);

	}
	
	public void deposit(int amount) {
	if(amount > 0)
		balance += amount;
	else
		System.out.println("you have entered wrong deposit");
		
	}
	
	void withdraw() {
//		....
	}
}
