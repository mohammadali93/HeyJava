package com.class5;

public class LogicalOperators {
	public static void main(String[] args) {
/*
 * if number is between 1-10==>number is small
 * if number is between 11=100-->number us medium
 * if number is between 101-100--> number is large
 */
	
		int num=15;
		if (num>=1 && num<=10) {
			System.out.println("number is small");
		}else if (num>=11 && num<=100) {
			System.out.println("number is medium");
		}else if (num>=101 && num<=1000) {
		System.out.println("number is large");
		}else {
			System.out.println("number is out of our range");
		}
	}

}
