package com.class12;

public class ForEachIn2D {
public static void main(String []args) {
	/*
	 * create a grocery list: fruits{}
	 * 						veggies{}
	 * 						dairy{}
	 * retrieve all values using 2 different loops
	 */
	
	String [] [] list= {
			{"Banana","apples","Kiwi","Oranges","Grapes"},
			{"Potates","Squash","Cucumbers","Kale","Spinach"},
			{"Butter","Eggs","Milk"}
	};
	for(int i=0; i<list.length; i++) {
		for(int k=0 ; k<list[i].length ; k++) {
			System.out.println(list[i][k]);
			
			System.out.println("----");
			System.out.println(list.length);
		}
		System.out.println("---------");
	}
	//SECOND METHOD
	for(String [] Grocery:list) {
		for (String goodStuff:Grocery) {
			System.out.println(goodStuff + " ");
			
		}
		System.out.println(">>>>>>>>>>>>>>");
	}
	
}
}
