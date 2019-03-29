package com.class7;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	
	double price;
	Scanner input= new Scanner (System.in);
	System.out.println("what is the price of soda");
	price=input.nextDouble();
	
	do {
		System.out.println("Please pay for your soda");
		price=input.nextDouble();
		
	}while(price!=1.99);
			System.out.println("Please enjoy your soda");
	
	
	
	
	}
		
	
}


