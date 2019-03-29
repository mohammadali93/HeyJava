package com.Reviewclass;

public class Review320 {
public static void main (String [] args) {
	
	// print following
	/* ....1
	 * ...22
	 * ..333
	 * .4444
	 * 55555
	 * 
	 * 
	 */
	for (int i=1 ; i<=5; i++) {
		for (int k=1; k<=0; k++) {
			if(k<=i) {
				System.out.print(i);
			}else {
				System.out.println(".");
			}
		}
	}
	//
	 for(int i =1; i<=5; i++) {
         for(int k = 1; k<=5; k++) {
             System.out.print(".");
         }
         for(int l = 1; l<=i; l++) {
             
             System.out.print(i);
         }
         
         System.out.println();
         
	 }
}
}
         


