package com.class9;

import java.util.Scanner;

public class Task5 {
public static void main(String []args) {
	Scanner scan;
    int secret, userNumber;
    
    secret=13;
    scan=new Scanner(System.in);
    System.out.println("Please enter any number from 1 to 20");
    do {
        
        userNumber=scan.nextInt();
        
        if (userNumber<secret) {
            System.out.println("Number is too small, try again");
        }else if (userNumber>secret){
            System.out.println("Number is too large,  try again");
        }
    }while(secret!=userNumber);
    
    System.out.println("Congratulations!!You got it!");
}
}
