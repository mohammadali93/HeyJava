package com.class20;

public class Task3 {
	public static void main(String [] args) {
		Task3 obj=new Task3();
		String reversed=obj.reverseString("Hello");
		System.out.println(reversed);
		
		boolean isPalidrome=obj.isPalidrome("hello");
		System.out.println(isPalidrome);
	}
	/*
	 * 1)Create a method that will take 1 parameter as a
	 *  String and return reversed String. Method should be visibly only within same package.
	 */
   
   protected String reverseString(String str) {
	   String reversed="";
	   for(int i=str.length()-1 ; i>=0 ; i--) {
		   reversed= reversed+str.charAt(i);
		   
	   }
	   return reversed;
   }
   
   /*
    * Create a method that will take a String and return whether String is palindrome or not. 
    * Method should available to all classes within your projects.
    * 
    */
	
   public boolean isPalidrome(String str) {
	   boolean flag= false;
	   String reversed= reverseString(str);
	   if(reversed.equalsIgnoreCase(str)) {
		   flag=true;
	   }
	   return flag=false;
	   }
   
   
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
