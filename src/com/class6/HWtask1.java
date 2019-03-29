package com.class6;

import java.util.Scanner;

public class HWtask1 {
public static void main(String[] args) {
	// which country user from and what language user speaks
	
	Scanner input= new Scanner (System.in);
	String country,language;
	
	System.out.println("Please enter your country");
	country=input.nextLine();
	
	switch (country) {
	case "Peshawar":
		language="Pushto";
		break;
	case "Murree":
		language="potwari";
		break;
	case "Lahore":
		language= "Punjabi";
		break;
	case "Russia":
		language="Russian";
		break;
		default:
		language="unknown";
	}
System.out.println("The language you spoke is "+language);	
}
}
