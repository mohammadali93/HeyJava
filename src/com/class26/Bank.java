package com.class26;

public class Bank {
	// A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
	//We have to print the money deposited by him in a particular bank. 
	//Create a class ‘Bank’ with a method ‘getBalance’ which returns 0. 
	//Make three subclasses named ‘BankA’, ‘BankB’ and ‘BankC’ with a method with the same name ‘getBalance’ which returns the amount deposited in that particular bank. 
	//Call the method ‘getBalance’ by the object of each of the three banks.
	
	public void getBalance(int i) {
		System.out.println(i);
	}
	
}
class BankA extends Bank{
	public void getBalance(int k) {
		System.out.println("Bank A has a balance of "+k);
}
}
	class BankB extends Bank{
		public void getBalance(int g) {
			System.out.println("Bank A has a balance of "+g);
		}
	}
		class BankC extends Bank{
			public void getBalance(int f) {
				System.out.println("Bank A has a balance of "+f);
			}
		}


		
	
	
