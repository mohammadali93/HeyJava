package com.class33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

//Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.

public class Task {

	public static void main(String[]args)
	{
		ArrayList<String>str= new ArrayList<>();
		str.add("Denis");
		str.add("Ali");
		str.add("Sumair");
		str.add("Hello");
		Collections.sort(str);
		System.out.println(str);
		
		//Create an array of Strings and using Arrays class  class sort the values of that array of Strings.
		
		String [] str1= {"tetiana" , "denis", "sekandar", "ali"};
		Arrays.sort(str1);
		for( String st :str1) {
			System.out.println(st);
		}
		
		//Create an HashSet of cities and add duplicates into it.
	    //Retrieve all values from hashset in 2 different ways.
	    //Retrieve all values in alphabetical order.
		
		HashSet<String>h= new HashSet<>();
		h.add("DC");
		h.add("Delaware");
		h.add("VA");
		h.add("DC");
		
		System.out.println(h);
		
		for(String k : h) {
			System.out.println(k);
			
		
		
		}
		List<String>list1= new ArrayList<>();
		
		Collections.sort(list1);
		System.out.println(list1);
		
		
	}
}
