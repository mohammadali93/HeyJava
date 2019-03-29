package com.class5;

import java.util.Scanner;

public class ConditionsAll {
public static void main(String[] args) {
	
	/*
	 * ask user to enter price and boolean value for sale
	 * based on the sale we will check the price 
	 * if price<20--> we will give discount adn give final price
	 * if price<20 less100 --> we will give 20%discount and give final price
	 * if price >20 less 100--> we will give 30%discount and give final price
	 * if price >100 and less <500--> we will give 50 discount and give final price
	 * 
	 */
	
	Scanner input= new Scanner( System.in);
	int discount;
	boolean sale;
	int price;
	double finalPrice;
	 System.out.println("Please enter if you have a sale");
	 
	 sale=input.nextBoolean();
	 
	 System.out.println("PLease enter your price of the item");
	 price=input.nextInt();
	 
	 if(sale) {
		 System.out.println("lets check all the discounts");
		 if(price<20) {
			 discount=20;
			 finalPrice= price-(price*0.2);
		 }else if (price)
		 
	 }else {
		 System.out.println("not interested");
	 }
}
}
