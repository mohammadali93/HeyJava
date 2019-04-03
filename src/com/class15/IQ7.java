package com.class15;

import java.util.Scanner;
// find out if number is prime.
public class IQ7 {
public static void main(String[] args) {
	int number;
	boolean prime=true;
	Scanner input= new Scanner(System.in);
	System.out.println("Please enter a number to see if it is prime");
	number=input.nextInt();
	for(int i=2 ; i<number; i++) {
		if(number % i !=0) {
			
		}else {
			prime=false;
			break;
		}
	}
	System.out.println(prime);
}
}
