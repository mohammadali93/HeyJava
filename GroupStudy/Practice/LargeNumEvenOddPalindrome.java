package Practice;

import java.util.Scanner;

public class LargeNumEvenOddPalindrome {
	
	
public static void main(String[] args) {
	
	LargeNumEvenOddPalindrome obj= new LargeNumEvenOddPalindrome();
	obj.largest1();
	obj.evenOdd();
	
	obj.isReverse("mom");
}
void largest1() {
	int a=56;
	int b=60;
	if(a>b) {
		System.out.println("a is largest");
	}else {
		System.out.println("b is greatest");
	}
}

// create a method that will take a number and prints wether it is even or odd
//
void evenOdd() {
	int b;
	Scanner scan= new Scanner(System.in);
	
	for(int i=1 ; i<=5; i++) {
		System.out.println("Please enter a number");
		b=scan.nextInt();
	
	if(b%2==0) {
		System.out.println(b+ "is even");
	}else {
		System.out.println("is Odd");
	}
	}
}
// create a method that will return of the string is palidrome or not

	

 void isReverse(String str) {
	 String reverse="";
	 String [] arr= str.split("");
	 for(int i=arr.length-1; i>=0 ; i--) {
		 reverse=reverse+arr[i];
	 if(reverse.contentEquals(str)) {
		 System.out.println("Is true");
	 }else {
		 System.out.println("Is false");
	 }
		 
		 
		 
		 
	 }
 }



}
