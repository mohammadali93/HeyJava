package com.class3;

public class Modulus {
	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		int div = a / b;

		System.out.println(div);// 3 or 3.3

		// modulus operator
		int mod = a % b;
		System.out.println(mod);// 1;

		int q = 101;
		int w = 10;
		System.out.println(q % w);// whatever will be left over after modulus% will be the answer just like 101/10
									// the left over is 1 so the modulus
		
		//the program runs from top to bottom and left to the right. in arthmetic it goes div,mult,add,subs.

	}

}
