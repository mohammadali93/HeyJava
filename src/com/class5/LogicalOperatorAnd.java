package com.class5;

import java.util.Scanner;

public class LogicalOperatorAnd {
public static void main(String[] args) {
	
	 // ask user to enter age and based on the age we will print:
    // if age is older than 1 but less than 3 ---> you are a baby
    // if age is older than 3 but less than 5 ___> you are a toddler
    // if age is older than 5 but less than 13 ---> you are a kid
    // if age is older than 13 but less than 20 --> you are a teenager
    // if age is older than 20 but less than 64 ---> you are adult
    // if age is older than 20 but less than 64 ---> senior
	
	int age;
	Scanner input= new Scanner(System.in);
	System.out.println("Please enter your age");
	age= input.nextInt();
	
	if(age>=1 && age<=3) {
		System.out.println("you are a baby");
	}else if (age>=3 && age<=5) {
		System.out.println("you are a toddler");
	}else if (age>=5 && age<=13) {
		System.out.println("you are a kid");
	}else if (age>=5 && age<=20) {
		System.out.println("you are a teenager");
	}else if(age>=20 && age<= 64) {
		System.out.println("you are adult");
	}else {
		System.out.println("you are a senior");
	}
}
}
