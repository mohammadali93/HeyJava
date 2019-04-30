package com.class30;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer int1= new Integer(10); //BOXING
		System.out.println(int1); 
		Integer int2= 10; //AUTOBOXING
		
		
		int num=int1.intValue(); //UNBOXING
		System.out.println(num);
		
		int num2=int2; //AUTO UNboxing
}
}