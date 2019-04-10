package com.class17;

public class Greetings1 {
public static void main(String[] args) {
        
        Greetings1 obj=new Greetings1();
        obj.askHowAreYou("Omer");	//argument
    }
    //VOID IS A RETURN TYPE, askHowAreYou--->method name
    void askHowAreYou(String name) { //Parameter
        System.out.println("How are you "+name);
    }
    
    // YOU CANNOT HAVE SAME METHOD WITH SAME PARAMETERS(ALWAYS REMEMBER)
    
    void askHowAreYou1(String name) {
        System.out.println("How are you "+name);
    }
    void askHowAreYou2(String name) {
        System.out.println("How are you "+name);
    }
    void askHowAreYou3(String name) {
        System.out.println("How are you "+name);
    }
}






