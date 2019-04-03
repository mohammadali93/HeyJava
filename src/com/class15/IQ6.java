package com.class15;

import java.util.Scanner;


// the word that u can read in reverse and it still doesnt change means it is PALIDROME, just like mom,dad,madam


public class IQ6 {
public static void main(String[] args) {
	
	Scanner scan= new Scanner (System.in);
	
	System.out.println("PLease enter any word to check if it is a palidrome!");;
	String word=scan.nextLine();
	
	String reverse="";
	for (int i=word.length()-1; i>=0; i--){
		reverse+=word.charAt(i);
	}
	if(word.equalsIgnoreCase(reverse)) {
		System.out.println("The word is palidrome ");
	}else {
		System.out.println("the word is not palidrome ");
	}
	System.out.print(reverse);
}
}
