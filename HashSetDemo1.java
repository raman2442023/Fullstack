package com.org;

import java.util.ArrayList;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	ArrayList al = new ArrayList();
		ArrayList ar = new ArrayList();
		
		
		ar.add(34);
		ar.add(15);
		ar.add(130);
		ar.add(20);
		ar.add(78);
		ar.add(50);
		
		int count=0;
		int total=0;
		
		for(Object score:ar)
		{
			Integer aa = (Integer)score;
			
			if(aa >=50)
				count++;
				total=total+aa;
			//System.out.println(score);
		}System.out.println(count);
		System.out.println(total);
		
	/*	al.add(30);
		al.add(56);
		al.add(true);
		al.add("Raman");
		al.add('a');
		al.add(5.6f);
		for(Object ee:al)
		{
			try
			{
				String a = (String)ee;
				System.out.println(a);
			}
			catch(ClassCastException ce)
			{
				
			}  */
			
			
			
			
				
			
			
		
		
}

	
	
	
	
	
}
