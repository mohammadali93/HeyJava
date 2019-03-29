package com.class5;

import java.util.Scanner;

public class PracticeHW2 {
public static void main(String[] args) {
	
	/*
	 * Program to find largest number among three numbers using nested ifprovided by a user (numbers must bedistinct)
	 * 
	 */
	double num1,num2,num3;
	Scanner largestNumber= new Scanner(System.in);
	System.out.println("Please enter your first number");
	num1= largestNumber.nextDouble();
	System.out.println("Please enter your second number");
	num2=largestNumber.nextDouble();
	System.out.println("Please enter your third number");
	num3=largestNumber.nextDouble();
	if(num1>num2) {
		if(num2>num3) {
			System.out.println(num1+ " is the largest number");
		}else {
			System.out.println(num3+ " is the largest number");
		}
		}else 
			if(num2>num3) {
				System.out.println(num2+ " is the largest number");
			}else {
				System.out.println(num3+ " is the largest number");
			}
			
	}
	}		
	