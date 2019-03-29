package com.class3;

public class ifElself {
	public static void main(String[] args) {

		// we only use else if condition up is not true
		//we can have multuple conditions use "else if" and put condition
		
		//using 7 days of week
		//based on hte value of the variable your program should print name of the day
		
		int day=5; // friday is day 5 of week
		
		if (day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday");
		}else if(day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if(day==5) {
			System.out.println("Friday is fun day");
		}else if(day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("I am not sure which day it is");
		}
		
	}
}
