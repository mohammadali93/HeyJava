package com.class4;

import java.util.Scanner;

public class ScannerClass1 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your name ");
	
	String name=input.next();
	System.out.println("Good morning "+name);
	
	
	Scanner myScanner= new Scanner (System.in);
    System.out.println("Please enter first number");
    int x= myScanner.nextInt();
}
}