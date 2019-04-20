package com.class26;

public class SuperWithConstructor {
	public SuperWithConstructor() {
		System.out.println("i am a parent class constructor");
	}
	SuperWithConstructor(String str){
		System.out.println("I am a parent constructor with one String parameter");
	}
}
class ChildOfSuperWithConstructor extends SuperWithConstructor {
	public ChildOfSuperWithConstructor() {
			super("Hello");
			
		// SUPER();- compiler adds it by default
		System.out.println("i am a child class constructor");
	}
}