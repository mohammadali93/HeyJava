package com.class6;

import java.util.Scanner;

public class StringsSwitch {
public static void main(String[] args) {
	// enter your country
	// based on the country--> specific food
	
	String country;
	String food;
	
  Scanner scan= new Scanner (System.in);
 	System.out.println("Please enter your country");
 	country=scan.next();
 	
 	switch (country) {
 	
 	case "USA":
 		food="Burger";
 		break;
 	case "Afghanistan":
 		food="Kabli Pulao";
 		break;
 	case "Pakistan":
 		food="Biryani";
 		break;
 		default:
 			food="invalid";
 			
 	}
 	
 	System.out.println("what is your food "+ food);
}
}
 