package com.class31;

import java.util.ArrayList;

public class Task3 {
public static void main(String[] args) {
	ArrayList<String>drinks=new ArrayList<String>();
	drinks.add("pepsi");
	drinks.add("redbull");
	drinks.add("vodka");
	drinks.add("sweet tea");
	
	for(int i=0 ; i<drinks.size(); i++) {
		
	String drink= drinks.get(i);
	if(drinks.contains("a") || drinks.contains("e")){
		drinks.set("i", "water");
		
	}
	}
}
}
