package com.class19;

public class MaxMin {
	
	//Write a program to find the maximum and minimum value of an array.
    //
    public static void main(String [] args) {
    int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
	
	int min= array[0];
	int max= array[0];
	
	
	for (int i=0 ; i<array.length; i++) {
		if(array[i]>=max) {
			max=array[i];
		}
		if(array[i]<=min) {
			min=array[i];
		}
		
			
		}
	}
	
	
}

