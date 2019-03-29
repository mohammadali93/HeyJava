package com.class3;

public class ConcatandOperater {
	public static void main (String [] args) {
		
		int x=10;
		int y=20;
		
		String a="Hello";
		String b="Bye";
		
		System.out.println(x+y+a+b);//30HelloBye
		System.out.println(x+a+y+b);//10Hello20Bye
		System.out.println(x+a+b+y);//10HelloBye20
		System.out.println(a+b+x+y);//Hellobye30;Hellobye1020;
		System.out.println(a+b+(x+y));//HelloBye30;
		System.out.println(y+b+(x%60));
		
	}

}
