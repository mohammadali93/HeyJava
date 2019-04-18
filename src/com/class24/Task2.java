package com.class24;

public class Task2 {
//Create 1 class with a static method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.
	
	public static void task(int a) {
		System.out.println(a);
	}
	static void task1(String b) {
		System.out.println(b);
	}
	static void task2(int d) {
		System.out.println(d);
	}

	
	
	public static void main(String[] args) {
		Task2 task= new Task2();
		task.task(5);
		task.task1("Ali");
		task.task2(8);
	}
}
