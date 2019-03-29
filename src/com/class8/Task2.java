package com.class8;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	
	// let user define a range of numbers to print
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter starting number");
	int startNumber= input.nextInt();
	System.out.println("Please enter ending number");
	int endingNumber=input.nextInt();
	 if(startNumber<endingNumber) {
		 
	 
	 		for(int i=startNumber; i<=endingNumber; i++) {
	 		System.out.println(i);		
		
	}
	 }else {
		 System.out.println("i wont execute your code");
}
		
	
}
}
