package com.class26;

public class PhoneTest {
public static void main (String [] args) {
	
	Phone obj= new Phone();
	obj.hasCamera();
	obj.makeCall();
	
	System.out.println("Object of iPhone class");
	iPhone obj1= new iPhone();
	obj1.hasCamera();
	obj1.makeCall();
	
	System.out.println("Object of Nokia class");
	
	Samsung obj2 = new Samsung();
	obj2.makeCall();
	obj2.hasCamera();
	
	System.out.println("   ");
	
	Nokia obj3= new Nokia();
	obj3.hasCamera();
	obj3.hasCamera();
	
	System.out.println("    ");
	
	Phone p= new iPhone();
	p.makeCall();
	p.hasCamera();
	
	System.out.println("              "   );
	Phone p1= new Nokia();
	p1.hasCamera();
	p1.makeCall();
	
	//p1.cannotBreak();ce: method is undefined
			//creating a variable of a ParentType
			Phone parentPhone;
			//assinging iphone object
			
			parentPhone=new iPhone();
			parentPhone.makeCall();
			parentPhone.hasCamera();
			
			//assinging samsung object
			parentPhone=new Samsung();
			parentPhone.makeCall();
			parentPhone.hasCamera();
			
			//assinging Nokia object 
			parentPhone=new Nokia();
			parentPhone.makeCall();
			parentPhone.hasCamera();
}
}
