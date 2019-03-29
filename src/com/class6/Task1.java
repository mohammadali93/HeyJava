package com.class6;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	boolean weather,snow,rain,sunny;
	int temp;
	String activity;
	
	Scanner input= new Scanner (System.in);
	
	System.out.println("what is the temp outside");
	temp=input.nextInt();
	
	if(temp>40 && temp<80) {
		System.out.println("is it raining");
		rain=input.nextBoolean();
		if(rain) {
			activity="go watch movie";
		}else {
			activity="go hiking";
		}
		
	}else if(temp>=25 && temp<40) {
		System.out.println("is it snowing");
		snow=input.nextBoolean();
		if(snow) {
			activity="go snow boarding";
		}else {
			activity="do coding";
		}
		
	}else if(temp>=80) {
		System.out.println("is it sunny");
		sunny=input.nextBoolean();
		if(sunny) {
			activity="go to beach";
		}else {
			activity="do more coding";
		}
	}else {
		System.out.println("please enter different temp");
		activity="unknown";
	}
		System.out.println("my activity for today "+activity);
	
	
	
	
	
	
	
}
}
