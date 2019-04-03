package com.class15;

public class IQ1 {
public static void main(String[] args) {
	int a,b,temp;
	a=10;
	b=20;
	a=a+b; //30
	b=a-b; //30-20
	a=a-b;
	
	System.out.println("the value of a is " +a);
	System.out.println("the value of b is "+ b);
	
	//// SWAP TWO STRING
	
	String str1="Hello";
	String str2="World";
	
	str1=str1+str2; // HelloWorld
	str2= str1.substring(0 , str1.length()-str2.length());// Hello
	str1= str1.substring(str2.length());
	
	System.out.println("the value of "+str1+"and the value of "+str2);
	
}
}
