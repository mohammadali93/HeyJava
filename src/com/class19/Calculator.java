package com.class19;

import java.util.Scanner;

public class Calculator {
public static void main(String [] args) {
	
	Scanner input= new Scanner(System.in);
	int num1,num2,num3;
	
	
	System.out.println("Please enter first number");
	num1=input.nextInt();

	System.out.println("Please enter second number");
	num2= input.nextInt();
	
	System.out.println("Please enter third number");
	num3= input.nextInt();
	int sum= num1+num2+num3;
	System.out.println("the sum of three numbers is "+sum);
	int average= sum/3;
	System.out.println("The average of three numbers is "+ average);
	
	if(num1>num2 || num2>num3 ||num1>num3 || num3>num1) {
		System.out.println("Maximum");
	}else {
		System.out.println("Minimum");
	}
	
	
Calculator sum1= new Calculator();
Calculator ave1= new Calculator();
Calculator min1= new Calculator();
Calculator max1= new Calculator();

	
	
}
}
