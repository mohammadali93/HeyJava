package com.class21;

public class Employee {
	static String CEO= "Sumair";
	int eID, salary; 
public static void main(String[] args) {

	
	
	
	Employee e1= new Employee();
	Employee e2= new Employee();
	
	e1.eID=1;
	e1.salary=80000;
	e1.getInfo();
	
	e2.eID=9;
	e2.salary=85000;
	e2.getInfo();
	
}
public void getInfo() {
	System.out.println("The ID of employee 1 is "+eID+" salary is" +salary+" and the CEO name is "+CEO);
	
}
}
