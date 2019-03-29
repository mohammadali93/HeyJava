package com.class5;

import java.util.Scanner;

public class LogicalPractice2 {

	public static void main(String[] args) {
	
		int quiz;
		int midterm;
		int finalScores;
		Scanner input= new Scanner(System.in);
		System.out.println("what is your quiz grade");
		quiz= input.nextInt();
		
		System.out.println("what is your midterm grade");
		midterm= input.nextInt();
		
		System.out.println("what is your final score");
		finalScores=input.nextInt();
		
		int averageScore= (quiz+midterm+finalScores)/3;
		System.out.println("you have grade " + averageScore);
		
		if(averageScore>=90) {
			System.out.println("A");
		}else if(averageScore>=70) {
			System.out.println("B");
		}else if(averageScore>=50) {
			System.out.println("C");
		}else if(averageScore<50) {
			System.out.println("F");
		} else {

		}
				

	}

}
