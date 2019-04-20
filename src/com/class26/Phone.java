package com.class26;
	
public class Phone {
	public void makeCall() {
		System.out.println("can make a phone call");
		
	}
	public void hasCamera() {
		System.out.println("Phone has a camera");
	}
}
class iPhone extends Phone{
	public void makeCall() {
		System.out.println("can make a FaceTime");
}
	public void hasCamera() {
		System.out.println("iPhone has a dual 16 mp camera");
}

}

class Nokia extends Phone{
	public void cannotBreak() {
		System.out.println("Nokia phone are unbreakable");
	}
}
class Samsung extends Phone{
	
	
	public void hasCamera() {
		System.out.println("Samsung phone  has 3 lenses camera");
	}
}