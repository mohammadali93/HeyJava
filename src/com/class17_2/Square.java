package com.class17_2;

public class Square {
public static void main(String[] args) {
	/* print this
	 * 
	 *  *****
	 *  *   *
	 *  *   *
	 *  *****
	 */
	 for(int a=1; a<=4;a++){
	        for(int y=1;y<7;y++) {
	            if(a==1 || a==4|| y==1|| y==6) {
	                System.out.print("*");
	            }else {
	                System.out.print(" ");
	            }
	            
	            }
	        
	        System.out.println();
	    }

}
}
