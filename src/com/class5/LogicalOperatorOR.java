package com.class5;

import java.util.Scanner;

public class LogicalOperatorOR {
	public static void main(String[] args) {

		/*
		 * we have seven days a week if days are from 1 - 5 --> weekdays 
		 * if days are from 6-7 --> weekend 
		 * otherwise not a valid day
		 */
int day;
Scanner input= new Scanner (System.in);
System.out.println("please enter the day");
day= input.nextInt();
 if (day ==1 || day ==2 || day==3 || day==4 || day==5) {
	 System.out.println("weekdays");
 }else if (day ==6 || day == 7) {
	 System.out.println("weekend");
 } else {
System.out.println("not a valid day");
	}
	}
}
