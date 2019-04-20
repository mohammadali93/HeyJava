package com.class25;

public class Parent {
Parent (){
	System.out.println("I am a parent constructor");
}
}
class Child extends Parent{
	

//YOU CANNOT OVERRIDE A CONSTRUCTOR
	/*Parent(){
		System.out.println("i am a child constructor");
	}
}
*/
Child(){
	System.out.println("I am a child constructor");
}
}
