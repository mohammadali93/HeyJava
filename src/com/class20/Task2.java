package com.class20;

public class Task2 {
/*
 * Create class student that will have a method getGrade
 * yuor methid should accept the score of a student and return a grade
 * score >90 -A
 * score >80 -B
 * score >70 - C
 * score > 50 -D
 * anything else -F
 * 
 */
	
	public static void main(String [] args) {
		Task2 obj= new Task2();
		System.out.println(obj.getGrade(98));
		
		
	}
	String getGrade(int score) {
		if(score>90) {
			return "A";
		} else if(score>80) {
			return "B";
		}else if(score>70) {
			return "C";
			
		}else if(score>50) {
			return "D";
		}else {
			return "F";
		}
	}
}
