package com.class34;
import java.util.*;
import java.util.Map.Entry;

public class Task {
//	Create a Map from array of cities that will sort keys in alphabetical order.
	//As a key store the name of the city and as a value store the length of the city name (Example: Paris=5, Moscow =6 etc..).
//	If any city name is more than 7 characters remove that city ( use entrySet with Iterator ).
	
	public static void main(String[] args) {
		
		
		String[] cityArray= {"Ukranian", "Pakistan", "Chantily", "Java", "Paris", "DC"};
		Map<String , Integer> entry= new TreeMap<>();
		for (String city: cityArray ) {
			
			cityMap.put(city , city.length());
			
		}
		System.out.println(cityMap);
	
		Iterator<Map.Entry<String, Integer>> entry= cityMap.entrySet().iterator();
		
	
		
	}
}
