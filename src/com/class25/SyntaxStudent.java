package com.class25;

public class SyntaxStudent extends Student{
	
	public void study() {
		System.out.println("Syntax students must study hard");
}
	protected void doHomework() {
		System.out.println("Syntax students must do REPL homework");
	}
	void attendClasses() {
		System.out.println("Syntax students must attend the classes");
	}
	//creating child specific method to do research
	private void doResearch() {
		System.out.println("Syntax students must make Uncle GOOGLE as their best friend");
	}
}