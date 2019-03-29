package com.class9;

import java.util.Scanner;

public class Task6 {
public static void main (String []args) {
	
	Scanner myScanner= new Scanner (System.in);
	int leapYear;
	

	for (int i=0; i<=10; i++) {
		System.out.println("Please enter leap year number");
		leapYear=myScanner.nextInt();
	
	if(leapYear%4==0) {
		System.out.println("It is a leap year");
	}else {
		System.out.println("It is not a leap year");
	}

	}
	
}

}
