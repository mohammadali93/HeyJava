package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {

		int a = 19;
		int b = 5;

		// in relationaloperators we only do "true or false"(boolean)

		boolean result = a > b;
		boolean result1 = a == b;

		// compare 2 numbers and "if" a is larger than b -->print

		if (a > b) {
			System.out.println("a is greater than b");

		} else {
			System.out.println("b is greater than a");
		}
			// declare price and if price is higher than expected
			
			
			double shoesPrice = 35.99;
			double allowedPrice = 38.99;

			if (shoesPrice>=allowedPrice) {
				System.out.println("i am buying the shoes");

			} else {
				System.out.println("i am NOT buying the shoes");

				// practicing giving value to a int 2
				int a1 =2;
				if (a >= 2) {
					System.out.println("the value of a1 is 2");
				}else {
					System.out.println("the value of a1 is not 2");
				}
				
			}
		

	}

}
