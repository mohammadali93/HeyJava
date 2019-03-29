package com.class11;

public class CountriesTask {
public static void main(String[] args) {
	//Create an array of countries: 
	//north america countries, south america countries, europe countries, asian countries, african countries.
	//Then print all values from that array.

	String [] [] countries= {
			{"Canada", "El Salvador", "Guatemala","Mexico"},
			{"Brazil","Argentina","Chile","Colombia"},
			{"Russia","France","Italy"},
			{"Pakistan","China","India","Iran","Iraq"},
			{"Egypt","Kenya","Ghana","Nigeria"}
	};
	for (int i=0; i<countries.length; i++) {
		for(int j=0; j<countries[i].length; j++) {
			System.out.println(countries[i][j]);
		}
		System.out.println("--------------------");
}
}
}