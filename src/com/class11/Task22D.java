package com.class11;

public class Task22D {
public static void main(String[] args) {
	//Create a 2D array that first row will contain 4 names and second row will contain grades. 
	//Then you program should print name of the students that has as an A and B grade
	
	String [] [] names= { {"Ali","Tayyab","Jessica","Jeisson"}, {"A","B"}};
	System.out.println(names[0][0]+" "+names[1][0]);
	System.out.println(names[0][1]+" "+names[1][0]);
	System.out.println(names[0][2]+" "+names[1][1]);
	System.out.println(names[0][3]+" "+names[1][1]);
}
}
