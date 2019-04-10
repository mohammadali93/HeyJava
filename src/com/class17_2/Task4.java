package com.class17_2;

public class Task4 {
public static void main(String []args) {
	for (int i=0; i<=4; i++) {
		for(int k =0; k<=i; k++) {
		System.out.print("*");
	}
	System.out.println();
	}
	for (int m=0; m<=4; m++) {
		for(int r=4; r>=m; r--) {
		System.out.print("*");
	}
		System.out.println();
	}
}
}
