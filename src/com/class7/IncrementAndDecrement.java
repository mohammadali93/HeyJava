package com.class7;

public class IncrementAndDecrement {
public static void main(String[] args) {
	
	int x=10;
	int y=x;
	
	System.out.println(x+ " "+y);
	int a=299;//300
	int b= a++;//299
	
	System.out.println(a);
	System.out.println(b);
	// first we assign the value adn then we increment or decrement
	
	//post decrement x--;
	
	int z=10;
	int c=z--;// first asign --> decrement
	
	System.out.println(z);//9
	System.out.println(c);//10
}
}
