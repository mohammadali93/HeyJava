package com.class11;

import java.util.Scanner;

public class Largest {
public static void main(String[] args) {
	// create an array of integars and find largest numbers

	
	int []numbers= {500,600,100,50};
	int largest=numbers[0];
	for(int i=0; i<numbers.length; i++) {
 if(numbers[i]>largest) {
	 largest=numbers[i];
 }
	}
	System.out.println("The largest number is "+ largest);
	}
	}


