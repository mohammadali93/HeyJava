package com.Reviewclass;

import java.util.Scanner;

public class PracticeRepl {
	public static void main(String[] args) {
		  String carOrigin;
		  Scanner input= new Scanner (System.in);
		  
		  System.out.println("Please enter your favorite car make");
		  carOrigin=input.nextLine();
		  
		  switch(carOrigin){
		    case "BMW":
		      carOrigin="german car";
		    break;
		    case "Toyota":
		     carOrigin="japenese car";
		    break;
		    case "Maserati":
		      carOrigin="italian car";
		      break;
		      default:
		      carOrigin="unknown";
		  }
		  System.out.println("Your favorite car is "+carOrigin);
		  
		  //
		  
		  
		  float f = 75.0f;
		  double d = 75.0;
		  int i = 75;

		  if( f == d ) {
		     if( f == i ) {
		        System.out.println("f, d and i are equal");
		      } else {
		        System.out.println("f, d are equal but i is not equal");
		      }

		  } else {
		      System.out.println("f and d are not equal");
		  }

			    
		
		  
		}
		}

