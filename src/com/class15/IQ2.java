package com.class15;

public class IQ2 {
public static void main(String []args) {
	
	int arr[]= {1000,45,6,87,292,-1};
	
	int min=arr[0];
	int secondLargest=0;
	int largest=0;
	
	for(int a:arr) {
		if(a>largest) {
			largest=a;
		}
		if(a<min) {
			min =a;
			
		}
	}
	for(int a : arr) {
		if(a >secondLargest && a<largest) {
		secondLargest=a;
			
		}
	}
	System.out.println("the minimum number is "+min);
	System.out.println("the secondLargest number is "+secondLargest);
	System.out.println("the largest number is "+largest);
}
}