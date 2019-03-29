package com.class6;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	
	// switch will only works with
	    //byte, short,int,char,long, and String
	
	
// you dont need to do it with the scanner, (we did extra fancy stuff using scanner)
	
	int day= 5;
	String dayName;
	Scanner scan= new Scanner (System.in);
	System.out.println("please enter your number");
	day=scan.nextInt();
	
	switch (day) {
	case 1:
		dayName="Monday";
		break;
	case 2:
		dayName="Tuesday";
		break;
	case 3:
		dayName="Wednesday";
		break;
	case 4:
		dayName="Thursday";
		break;
	case 5:
		dayName="Friday";
		break;
	case 6:
		dayName="Saturday";
		break;
	case 7:
		dayName="Sunday";
		break;
		default:
			dayName="invalid";
			
		
	}
	System.out.println("today is "+dayName);
}
}
