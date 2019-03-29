package com.class7;

public class OddNumbers {
public static void main(String[] args) {
	
	/*print only odd number from 1 to 20
	 * 
	 * 
	 */
	
	int num=1;
	
	while (num<=20) {
		
		if (num%2!=0) {
			System.out.println(num);
			num++;
			}
		num++;
	}
}
}
