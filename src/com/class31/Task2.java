package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
public static void main(String[] args) {
	
	ArrayList<String>words= new ArrayList<String>();
	words.add("ali");
	words.add("babe");
	words.add("charlie");
	words.add("alex");
	
	Iterator<String> iterator=words.iterator();
	Iterator<String> it=words.iterator();
    while(it.hasNext()) {
        String word=it.next();
        if(word.endsWith("e")) {
        it.remove();
}
    }
    System.out.println(words);
}
}
