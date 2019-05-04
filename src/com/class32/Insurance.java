package com.class32;

public abstract class Insurance {
//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
	
	//Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
	
	//Create 3 objects of the sub classes and store them in ArrayList. Using 1 reference variable access methods from different classes.
	
	
	public String InsuranceName;
	
	
	public Insurance(String InsuranceName) {
		this.InsuranceName=InsuranceName;
	}
	 public abstract void getQuote();
	 public abstract void cancelInsurance();
	 
	
	
	
}
 class Car extends Insurance{
	 public String carModel;

	public Car(String InsuranceName) {
		super(InsuranceName);
		
	}
		
		@Override
	public void getQuote() {
			System.out.println(InsuranceName +"will get you better Insurance");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(InsuranceName+" can cancel anytime");
		
	}
	}
class Pet extends Insurance{
	public Pet(String InsuranceName) {
		super(InsuranceName);
	}
	public void petType(String petType) {
		System.out.println("Pet type is "+petType);
	}
	@Override
	public void getQuote() {
		System.out.println("get pet insurance from "+InsuranceName);
		
	}
	@Override
	public void cancelInsurance() {
		System.out.println("cancel my pet insurance from "+InsuranceName);
		
	}
}
class Health extends Insurance{
	public Health(String InsuranceName) {
		super(InsuranceName);
		
	}

	public void InsuranceType(String InsuranceType) {
		System.out.println("Insurance type is "+InsuranceType);
	}

	@Override
	public void getQuote() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelInsurance() {
		// TODO Auto-generated method stub
		
	}
}
