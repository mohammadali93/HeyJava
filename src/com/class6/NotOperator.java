package com.class6;

public class NotOperator {
public static void main(String[] args) {
	
	/*
	 * not operator "!"
	 * 
	 * NOTES: the purpose of using not operator is it switch your answer into opposite, just like if its true it will make it false.
	 */
	boolean a=!true;
	
	System.out.println("the value of boolean value is "+a);
	
	boolean snow= true;
	// if it is not snowing then i will come to the class otherwise i will stay at home.
	
	if(!snow) {
		System.out.println("i will come to class");
	}
	
	
	int x=10;
	int y=20;
	
	if(!(x<y)) {
		System.out.println("Hello");
	}else {
		System.out.println("Bye");
	}

}
}
