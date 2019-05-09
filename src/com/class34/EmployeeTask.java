package com.class34;
import java.util.*;
import java.util.Map.Entry;

public class EmployeeTask {
	
	public static void main(String [] args) 
	{
		Map<String, Integer>emp= new LinkedHashMap<>();
		emp.put("Liza", 120000);
		emp.put("Ali", 95000);
		emp.put("ashmit", 65000);
		emp.put("Aige", 0);
		
		Set<Entry<String, Integer>> max= emp.entrySet();
		
		for(Map.Entry<String, Integer> map : emp.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
			if(map.getValue()>max) {
				System.out.println();
			}
		}
		
		
	}

}
