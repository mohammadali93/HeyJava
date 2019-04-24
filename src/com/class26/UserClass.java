package com.class26;

//Write program: user class  has a constructor that takes name and mobile number. Extend this class  by userInfo that will have user address variable.
//Print users name, mobile number and address in userDetails method. Test your code.

public class UserClass {
String name;
int number;
	UserClass(String name , int number){
		this.name="Alex";
		this.number=1234456;
	}
}
	class userInfo extends UserClass{
		String address;
		//String name;
		userInfo(String name, int number, String address){
			super(name, number);
			this.address=address;
	}
		public void userDetails() {
			System.out.println("Username is "+super.name+ " and phone number is "+number+" and address is "+address);
		}
		
		
	
	}
