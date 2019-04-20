package com.class26;

public class TestBank {
	public static void main(String [] args) {
		Bank obj= new Bank();
		obj.getBalance(0);
		
		BankA obj1= new BankA();
		obj1.getBalance(1000);
		
		BankB obj2= new BankB();
		obj2.getBalance(1500);
		
		BankC obj3= new BankC();
		obj3.getBalance(2000);
	}
}
