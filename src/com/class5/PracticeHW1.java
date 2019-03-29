package com.class5;

import java.util.Scanner;

public class PracticeHW1 {
public static void main(String[] args) {
	
	/*
	 * Write a program to find largest ofthree double values using if-else..ifprovided by a user (numbers must be distinct)
	 */
	double num1,num2,num3;
	Scanner largestNumber= new Scanner (System.in);
	System.out.println("Please enter your first number");
	num1= largestNumber.nextDouble();
	System.out.println("Please enter your second number");
	num2=largestNumber.nextDouble();
	System.out.println("Please enter your third number");
	num3=largestNumber.nextDouble();
	
	if(num1>num2 && num1>num2) {
		System.out.println(num1+ " is the largest number");
	}else if(num2>num3 && num2>num3) {
		System.out.println(num2+ " is the largest number");
	}else if(num3>num1 && num3>num2) {
		System.out.println(num3+ " is the largest number");
	}else {
		System.out.println("number is out of range");
	}
}
}
