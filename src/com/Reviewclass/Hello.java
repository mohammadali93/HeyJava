package com.Reviewclass;

public class Hello {
/* Create a class called Hello
    * create 1 constructor with one parameter
    * create 1 constructor with two parameters
    * create 1 constructor with three parameters
    *
    * i want you to use "this" key word and access those constructors pass values for each
    * but have one print statement for each constructor with one variable. make sure you use same
    * data type
    */
	Hello(String str){
		System.out.println("this is one parameter constructor");
	}
	Hello(String a , String b){
		this("Hello");
		System.out.println("this is two parameter constructor");
	}
	Hello(String str1 ,String str2 ,String str3){
		this("Hello","Moti");
		System.out.println("this is three parameter constructor");
}
	public static void main(String[] args) {
		Hello obj= new Hello("Hello","Moti","Panda");
		
	}
}
	u612900115
REF#10425197280