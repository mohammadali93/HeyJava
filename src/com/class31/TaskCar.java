package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskCar {

	 public static void main(String [] args) {
		 ArrayList<String>cars= new ArrayList<String>();
		 cars.add("Dodge Charger");
		 cars.add("Audi RS5");
		 cars.add("Benz c63s AMG");
		 cars.add("Porsche Makan Turbo");
		 
		 //using for loop
		for(int i=0 ; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		// using advanced loop
		System.out.println("<<<<<<advanced loop>>>>>>>>>>");
		for( String num :cars) {
			System.out.println(num);
		}
		System.out.println("<<<<<<<<<using iterator>>>>>>>>>>");
		Iterator<String>it=cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("<<<<<<<<<<<using while loop>>>>>>>>");
		int c=0;
		while(cars.size()>c) {
			String Mynum=cars.get(c);
			System.out.println(Mynum);
			c++;
				
			}
		// 
		}
	 }

