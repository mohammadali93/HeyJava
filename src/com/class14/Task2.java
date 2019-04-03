package com.class14;

public class Task2 {
public static void main(String[] args) {
	//Create a String that should be combination of letters,
	//numbers and special characters. 
	//Find out how many alpha characters are there in the String.
	//
	//
	String letters="ABCDEFG 12345 %$#^&*";
	String New=letters.replaceAll("[^A-Za z]", "");
	System.out.println(New.length());
}
}
