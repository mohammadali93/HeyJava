package com.class28;
	
public interface Bank {
	static String name="Bank"; //by default all variables inside the interface 
		String hello="hi"; //by default it will be public static final
	//by default compiler adds PUBLIC and ABSTRACT to every method
	
		void hasChecking();
		void hasSavings();
		void hasCreditCard();
		
}
class BOA implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking accounts");
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 savings accounts");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 credit cards");
	}
	
}
class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("PNC has 2 checking accounts");		
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 checking accounts");		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 credit cards");
		
	}
	
}
