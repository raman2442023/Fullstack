package com.org;

public class Adhar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
		int age =4;
		String relign ="Indian";
		
		if (age >=5 && relign == "Indian")
		{ 
		  System.out.println("Your eligible for Adhar");	
		}
		else if (age>=5 && relign !="Indian")
			
		{
			System.out.println("Your not elegible for Adhar");
		}
		else if (age<5 && relign=="Indian")
		{
			System.out.println("Your not elegible for Adhar");
		}
		else
		{
			System.out.println("Your not eligible for Adhar");
		}
			
			
	}
}
