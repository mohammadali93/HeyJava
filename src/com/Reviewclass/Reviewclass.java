package com.Reviewclass;

import java.util.Scanner;

public class Reviewclass {
public static void main(String[] args) {
	int x=16;
	
	if(x%8==0) {
		System.out.println("Even");
	}else {
		System.out.println("odd");
	}
	
	//
	int time1=0700;
	if(time1==0700) {
		System.out.println("good morning");
	}else if(time1>1205) {
		System.out.println("good afternoon");
	}else{
		System.out.println("good evening");
	}
	//
	//we will go on vacation if it is summer and it is true
	boolean Summer= true;
	boolean sunny= true;
	
	if(Summer==true) {
		System.out.println("we will go on vacation");
		
	}else {
		System.out.println("we will not go on vacation");
	}
	
	//// Scanner statement
	
	String name;
	Scanner input= new Scanner (System.in);
	name= input.nextLine();
	System.out.println("what is your name");
	
	
	}
}
