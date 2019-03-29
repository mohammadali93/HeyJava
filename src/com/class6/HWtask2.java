package com.class6;

import java.util.Scanner;

public class HWtask2 {
public static void main(String[] args) {
	//Allow user to enter grade and then provideexplanation: A-Excellent, B-Good, C-Average,D-Bad, 
	//any other grade --> Not Acceptable. At the end your program should print which grade wasentered by a user with explanation.
	
	Scanner input= new Scanner (System.in);
	String grade;
	System.out.println("what is your grade");
	grade=input.nextLine();
	
	switch(grade) {
	case "A":
		grade="Excellent";
		break;
	case "B":
		grade="Good";
		break;
	case "C":
		grade="Average";
		break;
	case "D":
	grade="Bad";
	break;
	case "F":
		grade="Fail";
		break;
		default:
			grade="invalid";
		
	}
	System.out.println("Your grade is "+grade);
}
}
