package com.org;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		hm.put("Sachin", 45);
		hm.put("Dhoni", 55);
		hm.put("rohit", 85);
		hm.put("dhawan", 100);
		hm.put("rohit", 87);
		hm.put("rohit", 91);
//		
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
		
		Set ss = hm.entrySet();
		
		for(Object obj:ss)
		{	
			Entry entry = (Entry)obj;
			//System.out.println(entry.getKey()+" : "+entry.getValue()); 
			
			int score = (Integer)entry.getValue();
			
			if(score <= 50)
			{
				System.out.println(entry.getKey()) ;
			}
	
		}
		
		
	}

}
