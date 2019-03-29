package com.class4;

public class PracticeNestedTask {
	public static void main(String[] args) {
		double MortgageRate = 4.5;
		int mortgagePrice = 300000;

if (MortgageRate > 4.5) {
	System.out.println("i will not buy a house");
	
} else {
	System.out.println("i will consider buying a house");
	if (mortgagePrice < 200000) {
		System.out.println("i will pay cash");
	} else {
		System.out.println("i will get a loan");
	}
}
}
}