package com.Reviewclass;

import java.util.Scanner;

public class ReviewPractice {
public static void main(String[] args) {
	String name, gender;
	int age;
	long mobileNo;
	Scanner input= new Scanner (System.in);
	System.out.println("what is your name");
	name=input.nextLine();
	System.out.println("What is your gender");
	gender=input.nextLine();
	System.out.println("what is your age");
	age=input.nextInt();
	System.out.println("what is your phone number");
	mobileNo=input.nextLong();
	
	//
	int num;
	Scanner input2= new Scanner(System.in);
	System.out.println("enter your number");
	num= input2.nextInt();
	if(num>0) {
		System.out.println("positve");
	}else {
		System.out.println("negative");
	}
	//
	boolean value;
    Scanner input3= new Scanner (System.in);
    System.out.println("Input the boolean value");
   
    
}
}
