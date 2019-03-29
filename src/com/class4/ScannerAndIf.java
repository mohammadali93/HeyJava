package com.class4;

import java.util.Scanner;

public class ScannerAndIf {
public static void main(String[] args) {
	/*
	 * enter city name and temp in F
	 * convert from F-->C
	 * your program should say "THe temp in the city__is___"
	 */
	
	String cityName;
	int temp;
	
	Scanner myScanner=new Scanner(System.in);
	System.out.println("Please enter your city name ");
	
	cityName=myScanner.nextLine();
	System.out.println("Please enter temp in F");
	temp=myScanner.nextInt();
	// coverting the temp from F to C
	//formula (F -32)x5/9
	
	int convertedTemp=(temp - 32)*5/9;
	System.out.println(" The temp in the city " +cityName+" is "+convertedTemp+"C");
	
	
}
}
