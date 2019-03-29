package com.class7;

import java.util.Scanner;

public class ScannerLoop {
public static void main(String[] args) {
	
	/*prompt user to ask the name 3 times and print "You are doing great ____"//
	 * 
	 *  
	 * 
	 */
	
	Scanner input= new Scanner (System.in);
	String name;
	
	int a=1;
	
	while(a <= 3) {
		System.out.println("Please enter your name");
		name=input.nextLine();
		System.out.println("you are doing great "+name);
		
		a++;
	}
	
}

}
