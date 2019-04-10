package com.class17_2;

public class NestedLoops {
	
public static void main(String[] args) {
	

	NestedLoops demo= new NestedLoops();
	demo.printNumber();
	
}
 void printNumber() {
	for (int i = 1; i < 5; i++) {

        for (int y = 1; y < 6; y++) {

            System.out.print(y);
        }
        System.out.println();
	}
}
}




