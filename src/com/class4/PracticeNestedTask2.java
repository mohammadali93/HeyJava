package com.class4;

public class PracticeNestedTask2 {
public static void main (String [] args) {
	
	int workedYears=5;
	int salary= 50000;
	
	if(workedYears >=5) {
		System.out.println("he is eligible for bonus");
		if (salary >= 50000) {
			System.out.println("he will get 5000 bonus");
		}else {
			System.out.println("he will get 3000 bonus");
		}
	}else {
		System.out.println("he is not eligible for bonus");
	}

}
}
