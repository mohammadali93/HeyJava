package com.class11;

public class CarsTask {
public static void main(String[] args) {
	
	// create an array of cars: american, german, korean, italian.
	// retrieve all the values from the array
	
	String [] [] cars= { 
			{"Dodge", "Ford", "Jeep" , "Chrysler"},
			
			{"Benz", "BMW"," VW"},
			{"Hyundai","Kia"},
			{"Porsche","Maserati","Lamborgini"}};
	for (int i=0; i<cars.length; i++) {
		for(int j=0; j<cars[i].length ;j++) {
			System.out.print(cars [i][j] + " ");
		}
		System.out.println();
	}
	}
}

