package com.class22;

public class ClassStudents {
//Write a java program of Class Students that takes students name and 3 subject grades. 
	//Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
	//Your program should print an average mark of each students name.
	//NOTE: please male different names for instance and local variables. (edited) 
	
	public  String studentName;
	public  int grades;
	public static void main(String [] args) {
		
	}
	public  ClassStudents(String name) {
	System.out.println("my name is "+name+" and my average is "+grades);
	}
	int grades(int a, int b, int c) {
		return (a+b+c)/3;
	}
	
}
