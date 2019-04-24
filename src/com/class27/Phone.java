package com.class27;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone can make call");
	}
	public void sendText() {
		System.out.println("Phone can send text");
	}
	public abstract void unlockPhone();
	public abstract void viewPictures();
}
class iPhone extends Phone{  //concrete class - is a class that is inherited from a abstract class
	// or impleted by interface and providing implementation of all
	// unimplemented / abstract classes

	@Override
	public void unlockPhone() {
		System.out.println("To unlock iPhone we can use FaceID or FingerPrint");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on iPhone can go to Images ");
		
	}
	class Android extends Phone {

		@Override
		public void unlockPhone() {
			System.out.println("To unlock Samsung we need to enter password");
			
		}

		@Override
		public void viewPictures() {
			System.out.println("To view pictures we can go to Gallery");
			
		}
		
	}
	
	}
