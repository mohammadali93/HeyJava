package com.class20;

public class Task1 {

	public static void main(String [] args) {
		Task1 obj= new Task1();
	String email= obj.createEmail("John", "Dew", "gmail");
	System.out.println(email);
	
	email=obj.createEmail("Bob" , "Snow" , "outlook");
	System.out.println(email);
		
		
	}
	String createEmail(String name, String lastName , String email) 
	{
		String createEmail= name+lastName+"@"+email +".com";
		return email.toLowerCase();
		
	}
}
