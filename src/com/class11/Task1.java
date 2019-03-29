package com.class11;

public class Task1 {
public static void main(String[] args) {
	// one method
	String [] cars= {"Ferrari", "Mclaren","Bugatti","Toyota","Dodge","Honda"};
	for(int i=0; i<=cars.length-1; i++) {
		System.out.println(cars[i]);
	}
	
   // second method
	String [] carsNames= {"Ferrari", "Mclaren","Bugatti","Toyota","Dodge","Honda"};
	for(String Exotic:carsNames) {
		System.out.println(Exotic);
	}
}
}
