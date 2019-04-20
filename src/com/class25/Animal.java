package com.class25;

public class Animal {
	
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}
class puppy extends Animal {
	// WE CANNOT OVERRIDE A STATIC METHOD WITH INSTANCE
	
	/*public void whoAmI() {
		System.out.println("I am  a PUPPY");
	}

	*/
}
class Monkey extends Animal{
	public static void whoAmI() {
		System.out.println("i am a  monkey");
	}
}