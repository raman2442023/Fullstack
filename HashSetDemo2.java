package com.org;

import java.util.ArrayList;
import java.util.Scanner;

public class HashSetDemo2 {

	public static void main(String[] args) {
		

		ArrayList ar = new ArrayList();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try {

				System.out.println("Enter the mark :");
				String marks =sc.next();
				Integer in = Integer.parseInt(marks);
				ar.add(marks);
			}
			catch( Exception ee)
			{
				break;
			}
			
		}System.out.println(ar);
			
			
			
		
}

	
	
	
	
	
}
