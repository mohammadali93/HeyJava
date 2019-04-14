package com.class23;

public class ConstructorOverLoading {

	ConstructorOverLoading(){
		System.out.println("I am constructor with no parameters");
	}
	ConstructorOverLoading(String str){
		System.out.println("I am constructor with parameters");
	}
	ConstructorOverLoading(String str , String str1){
		System.out.println("I am constructor with two Strings");
	}
	ConstructorOverLoading()
}
