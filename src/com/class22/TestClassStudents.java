package com.class22;

public class TestClassStudents {
public static void main(String[] args) {
	ClassStudents obj=new ClassStudents("Shaban Haq");
	System.out.println(obj.grades(80,89,99));
	
	ClassStudents obj1=new ClassStudents("Ashmit Nepal");
	System.out.println(obj1.grades(59,99,29));
	
	ClassStudents obj2=new ClassStudents("Tayab Raza");
	System.out.println(obj2.grades(50,9,89));
	
	ClassStudents obj4=new ClassStudents("Ali");
	System.out.println(obj4.grades(99,99,99));
	
	ClassStudents obj5=new ClassStudents("Denis");
	System.out.println(obj5.grades(58,54,77));
}
}
