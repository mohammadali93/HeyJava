package com.class9;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	/*
	 * 1. Write a program that reads a set of integers, provided by a user and then prints the sum of the even and odd integers.
	 * 
	 * 
	 */
	
	Scanner input= new Scanner (System.in);
	int startPoint;
	int endPoint;
	int sumEven=0;
	int sumOdd=0;
	System.out.println("Please enter your start point");
	startPoint= input.nextInt();
	
	System.out.println("Please enter your end point");
	endPoint= input.nextInt();

	
	for (int i=startPoint; i<=endPoint; i++ ) {
	if(i%2==0) {
	sumEven+=i;
	
	}else {
	sumOdd+=i;
	}
	}
	System.out.println(sumEven);
	System.out.println(sumOdd);
}
}
