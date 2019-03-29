package com.class10;

public class Task2 {
public static void main(String[] args) {
	
	//Create an array of names and store all names of your group.
	//Then print your name from that array. (use 2 different ways of creating an array).
	
	String [] names= {"Ali", "Jeisson","Tayyab","Yessica"};
	System.out.println(names[0]);
	
	String[]name= new String[4];
	name[0]="Ali";
	name[1]="Jeisson";
	name[2]="Tayyab";
	name[3]="Yessica";
	
	System.out.println(name[0]);
}
}
