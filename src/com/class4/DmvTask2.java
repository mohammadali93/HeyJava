package com.class4;

import java.util.Scanner;

public class DmvTask2 {	
	
	public static void main(String[] args) {
		
		int age;
		 Scanner age1= new Scanner(System.in);
		 System.out.println("what is your age");
		 age=age1.nextInt();
		 if (age==18) {
			 System.out.println("you can have license");
		 }else {
			 System.out.println("you cant have the license");
		 }
	}

}
