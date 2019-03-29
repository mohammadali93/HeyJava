package com.class9;

public class NestedLoops {
public static void main(String[] args) {
	for (int i = 1; i < 5; i++) {

        for (int y = 1; y < 6; y++) {

            System.out.print(y);
        }
        System.out.println();
    }
    //
	/*I want to print pattern
     * 123456789 -->rows =5, columns=9
     * 123456789
     * 123456789
     * 123456789
     * 123456789
     */
    
    for (int i=1; i<=5; i++) {
        
        for (int y=1; y<=9; y++) {
            
            System.out.print(y);//12345
        }
        System.out.println();
    }
    
    /*I want to print pattern
     * 1111111 --> rows=7, columns=7
     * 2222222
     * 3333333
     * 4444444
     * 5555555
     * 6666666
     * 7777777
     */
    
    for (int i=1; i<=7; i++) {
        
        for (int y=1; y<=7; y++) {
            System.out.print(i);//1111111 //2222222
        }
        System.out.println();

    }
    //
    for (int a=0; a<4; a++) {
        
        for(int b=0; b<5; b++) {
            
            System.out.print("*");
        }
        System.out.println();
    }
    /* i wnat to print pattern
     * 54321
     * 54321
     * 54321
     * 54321
     * 54321
     */
    for (int a=0; a<4 ;a++) {
    	for (int b=5; b>0; b--) {
    		System.out.print(b);
    		
    	}
    	System.out.println();
    }
    /* i want to print pattern
     * 55555
     * 44444
     * 33333
     * 22222
     * 11111
     */
  
    	System.out.println();
    	
    	/*make a pattern
    	 *  *
    	 *  **
    	 *  ***
    	 *  ****
    	 */
    	for (int i=0; i<=4; i++) {
    		for(int k=0; k<=i ; k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	/*
    	 * Make a pattern
    	 * 
    	 *   *****
    	 *   ****
    	 *   ***
    	 *   **
    	 *   *
    	 * 
    	 */
    	for (int m=1 ; m<=6 ; m++) {
    		for (int a=6 ; a>=m ; a--) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }

    	
}






