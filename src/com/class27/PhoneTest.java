package com.class27;

public class PhoneTest {
	public static void main(String[] args) {
		
	
	//Phone obj= new Phone(); cannot instantiate Phone class because it is an abstract class
	
	Phone ph= new iPhone();
	ph.makeCall();
	ph.sendText();
	ph.unlockPhone();
	ph.viewPictures();
	
	Phone ph1= new Android();
	ph1.makeCall();
	ph1.sendText();
	
}
}