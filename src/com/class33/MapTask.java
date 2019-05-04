package com.class33;
import java.util.*;
public class MapTask {
	
	public static void main(String[] args)
	{
		//Create a map of a building. Store floor number and it is associated company name. 
		//(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
		//Check how many entries you have?
			//	Update company on a 4th floor
			//	Remove company on the 7th floor
				//Print your map
		
		Map<Integer, String > building=new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3,"Sterling");
		building.put(4 ,"Nepal");
		building.put(5, "Syntax");
		building.put(7, "Car");
		building.put(6, "Dennis");
		
		//getting size
		System.out.println(building.size());
		
		//updating 4th floor
		building.put(4, "Pakistan");
		
		//removing 7th floor
		building.remove(7);
		
		System.out.println(building);
	}

}
