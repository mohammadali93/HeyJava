package com.class26;

public class StudentClass {

	//Write program as a student class   that has instance variables name and address. 
	//Create a constructor that will initialize those variables. Print name & address of given  student by the displayInfo method.
	
	String name;
	String address;
	
	public StudentClass() {
		this.name="Alex";
		this.address="Annandale";
	}
		
void getInfo() {
	System.out.println("my name is "+name+ " and my address is "+address);
}
public static void main(String [] args) {
	StudentClass obj= new StudentClass();
	obj.getInfo();
}
	
	}


