package com.class4;

public class NestedIfAgain {
	public static void main(String[] args) {
// NestedIf statement goes in the if statement, and system always executes from top to bottom
		
		
		double gpa = 3.5;
		double expectedGpa = 3.7;
		boolean hasDiploma = true;
		if(hasDiploma) {
			System.out.println("Congratulation");
			if(gpa>expectedGpa) {
				System.out.println("you wont be hired");
			}else {
				System.out.println("you will be hired");
			}
		}else {
			System.out.println("go get degree");
		}
		

	}
}
