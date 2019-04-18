package com.class24;

public class Degree {
 public void getDegree() {
	 System.out.println("i got a degree");
 }
 
}
class Undergraduate extends Degree {
	public void msg() {
		System.out.println("I am an Undergraduate student");
}
}
class Postgraduate extends Degree{
	public void msg1() {
		System.out.println("I am Postgraduate student");
	}
}