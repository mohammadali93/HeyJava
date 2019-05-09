package com.class34;
import java.util.*;

public class PersonTest {

	public static void main(String [] args)
	{
		
		Map<Integer , Person > personMap= new HashMap<>();
		
		personMap.put(1, new Person("Mo", "Ali", 25 , 20.00));
		personMap.put(2 , new Person("Liza", "Fabryka ", 19 , 90.00));
		personMap.put(3, new Person("Ashmit", "Nepal", 27 , 89.99));
		personMap.put(4, new Person("Tayyab" , "Abbasi", 26 , 02.00));
		
		Collection<Person> per1=personMap.values();
		for(Person personMap1 : per1) {
			personMap1.details();
		}
		
	}
}
