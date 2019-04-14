package com.class23;

public class Employee {
	protected static String department= "IT department";
public int salary; 
protected int salary1;

public  void getPaid() {
	System.out.println("Employee gets paid "+salary);
}
	public static void work() {
	System.out.println("Employee students works in "+department);
}
	protected void test() {
		System.out.println("I am a protected ");
	}
	protected void test1() {
		System.out.println("i am a default method");
	}
}
