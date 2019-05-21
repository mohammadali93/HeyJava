package com.class36;

public class Task {

	public static void main(String[] args) {
		amount(600 , 499);
	
		
	
	}
	public static void amount(int money, int balance) {
	
		if(money<balance) {
			System.out.println("you got money bro");
		}else {
			throw new ArithmeticException("you are broke bro");
		}
	}
}
