package com.class7;

import java.util.Scanner;

public class TaskInClass {
	public static void main(String[] args) {
		
		//1. Declare variable and increase by 100 using shorthand operator
        //* 2. Declare variable and decrease by 67 using shorthand operator
       // * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
       // * each person should get an equal piece of cake
       // *
       // * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
       // * using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
		
		Scanner input= new Scanner(System.in);
		int number;
		int a = 100;
		System.out.println("Please enter your number");
		number= input.nextInt();
		//1* increase by 100
		
		a+=number;
		System.out.println(a);
		
		//2*decrease by 67
		
		int b= 67;
		b-=number;
		System.out.println(b);
		
		//3* 
		
		int cakePiece=11;

		cakePiece%=4;
		System.out.println(cakePiece);//3
		System.out.println("Everyone should get "+cakePiece+ " piece");
		
		//4*
		
		int cakePiece2= 25;
		cakePiece2%=7;
		System.out.println(cakePiece2);
		System.out.println("Everyone should get "+cakePiece2 + " piece");
	}

}
