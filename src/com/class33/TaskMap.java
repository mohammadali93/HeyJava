package com.class33;
import java.util.*;
public class TaskMap {

	public static void main(String[] args)
	{
		
		Map<String, String > map =new HashMap<>();
		map.put("Nepal", "Kathmandu");
		map.put("VA", "Richmond");
		map.put("MD", "Annapolis");
		map.put("Turkey", "Ankara");
		map.put("Pakistan", "Lahore");
		
		Set<String> key= map.keySet();
		
		
		
		for(String st : key) {
			System.out.println(st+" "+map.get(map));
		}
		Iterator<String> iT=key.iterator();
		while(iT.hasNext()) {
			System.out.println(iT.next());
		}
		Collection<String> col= map.values();
		for (String val : col) {
			System.out.println(val);
			
		}
		Iterator<String>Its= col.iterator();
		while(Its.hasNext()) {
			System.out.println(Its.next());
		}
		
		
	}
}
