package com.class5;

import java.util.Scanner;

public class LogicalPracticeEq1 {
public static void main(String[] args) {
	
	/*Enter two people height in inches
	 * short ( under 5 feet)
	 * medium (under 5 to 6 feet) 
	 * tall (6 feet or over)
	 */
	int height1;
	Scanner input= new Scanner (System.in);
	System.out.println("PLease state height in inches");
	height1= input.nextInt();
	int height2= height1/12;
	System.out.println("Your height in ft is " +height2);
	if (height2<=5) {
		System.out.println("you are short");
	}else if(height2<=6) {
		System.out.println("you are medium");
	}else {
		System.out.println("you are tall");
	}
	
	
	
}
}
