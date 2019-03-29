package com.class7;

public class WhileAndDoWhile {
public static void main(String[] args) {
	
	/*in the DOLOOPS we do the action first and then we check, but in the WHILE LOOP we check first and then do action/execute.
	 * 
	 * 
	 */
	
	int a=10;
	
	do {// executes first and then it checks
		System.out.println("Hello");
		a++;
		
	}while (a>15);
	//----------------------------
	
	int b=10;
	while (b<15) {
		System.out.println("Bye");
		b++;
	}
}
}
