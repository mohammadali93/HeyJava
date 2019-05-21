package com.class35;
import java.util.*;
public class Task {

	public static void main(String [] arg)
	{
		Scanner scan= new Scanner(System.in);
		int a;
		System.out.println("Please enter a number");
		
		try {
			a= scan.nextInt();
			if(a==scan.nextInt()) {
				
			}
		}catch(InputMismatchException e){
			System.out.println("mis match error");
		}catch(Exception e) {
			
		}
	}
}
