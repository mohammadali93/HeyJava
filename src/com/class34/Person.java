package com.class34;

//Create a Person class with following private fields: name, lastName, age, salary.
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map to store personId and a Person Object. Print each object details.
public class Person {

	private String name;
	private String lastName;
	private int age;
	private double salary;
	
	 Person(String name , String lastName, int age , double salary){
	this.name=name;
	this.lastName= lastName;
	this.age=age;
	this.salary=salary;
	 }
	public  void details() {
		System.out.println("The name of the person is "+name+" and the last name is "+lastName+" and age is "+age+" and salary is "+salary);
	}
	 }

