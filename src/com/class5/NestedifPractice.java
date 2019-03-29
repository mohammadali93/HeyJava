package com.class5;

public class NestedifPractice {
public static void main(String[] args) {
	
	/*
	 * check if user has a credit card--> what is the balance
	 */
	
	boolean creditCard=true;
	int balance= 1000;
	
	if(creditCard) {
		System.out.println("check the balance");
		if (balance >=1000) {
			System.out.println("pay off immediately");
		}else {
			System.out.println("you are safe");
		}
	}else {
		System.out.println("do you want a credit card");
	}
}
}
