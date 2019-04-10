package com.class16;

public class Dog {
	//Create a Dog Class and create 3 different objects of it:
	//Husky, Bulldog, Labrador  with specific  attributes and behaviours.
	String breed, name;
	int weight, height;
	boolean angryDog;
	
	public static void main (String [] args) {
		Dog d1=new Dog();
		d1.breed="Husky";
		d1.name="Rambo";
		d1.angryDog=true;
		d1.height=3;
		d1.weight=100;
		
		Dog d2=new Dog();
		d2.breed="Bulldog";
		d2.name="Lilly";
		d2.angryDog=false;
		d2.height=2;
		d2.weight=50;
		
		Dog d3=new Dog();
		d3.breed="Labrador";
		d3.name="Lucky";
		d3.angryDog=true;
		d3.height=4;
		d3.weight=12;
	
	d1.bark();
	d1.playWithToys();
	d1.bites();
	
	
	}
		void bark() {
			System.out.println("Woof Woof");
		}
		void playWithToys() {
			System.out.println("Loves to play with toys ");
			
		}
		void bites() {
			
			System.out.println( " Doesnt not bite");
		}
		}
	

