package com.class25;

public class Student {

	public void study() {
		System.out.println("Students must study");
	}
	protected void doHomework() {
		System.out.println("Students must do homework");
	}
	void attendClasses() {
		System.out.println("Students must attend the classes");
	}
	//PRIVATE METHODS CANNOT BE OVERRIDDEN
	private void doResearch() {
		System.out.println("Students must to research");
	}
}
