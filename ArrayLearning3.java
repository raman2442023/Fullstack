package com.org;

import java.util.Scanner;

public class ArrayLearning3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayLearning3 al = new ArrayLearning3();
		
		//al.find_value();
		//al.count_value();
		//al.store_odd_value();
		//al.print_adjust_element();
		//al.print_adjust_element1();
		al.print_first_repeated_char();
		//al.print_multiple_next_num();
		
	}

	private void print_multiple_next_num() {
		// TODO Auto-generated method stub
		
		int ar[]= {1,2,3,4,5};	
		
		int i=0;
		
		while(i<ar.length-1)
		{
			int no1=ar[i];
			int no2=ar[i+1];
			System.out.println(no1*no2);
			i++;
		}
		
	}

	private void print_adjust_element1() {
		// TODO Auto-generated method stub
		int[] a= {3,8,5,13};
		int i=0;
		
		while(i<a.length-1)
		{
			int start=a[i] < a[i+1]? a[i]:a[i+1];
			int end=a[i] > a[i+1]?a[i]:a[i+1];
			
			
			for(int no=start+1;no<end;no++)
			{
				System.out.print(no+" ");
			}
			System.out.println();
			i++;
		}
		
	}

	private void print_first_repeated_char() {
		// TODO Auto-generated method stub
		
		
		char [] name= {'S','r','i','v','a','r','s','h','a','n'};
		
		char ch=name[4];
		
		int j=0;
		
		//while(j<name.length)
		
		for(int i=5;i<name.length;i++)
		{
			if(ch==name[i])
			{
				System.out.println("Yes first repeated char is "+ch);
				break;
			}
		}
	}

	private void print_adjust_element() {
		// TODO Auto-generated method stub
		
		int[] a= {3,8,5,13};
		int i=0;
		
		while(i<a.length-1)
		{
			int start=a[i];
			int end=a[i+1];
			
			if(start<end)
			{
			for(int no=start+1;no<end;no++)
			{
				System.out.print(no+" ");
			}
			System.out.println();	
		}
			else
			{
				for(int no=start-1;no>end;no--)
				{
					System.out.print(no+" ");
				}
			System.out.println();
			}	
			i++;
		}
	}

	private void store_odd_value() {
		// TODO Auto-generated method stub
		
		int ar[]= {23,5,36,8,7};
		int count=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			{
				count++;
			}
		}
		
		int b[]=new int [count];
		
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				b[j]=ar[i];
				
			}
		}
	}

	private void count_value() {
		// TODO Auto-generated method stub
		
		int ar[]= {5,5,4,3,4,6,4};
		int count=0;
		int num=6;
		for(int i=0;i<ar.length;i++)
		{
			if(num==ar[i])
				{
					
					//System.out.println("Yes we got "+i );
					count++;
					
				}
		}
		System.out.println(count);
	}

	private void find_value() {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int [] ar= {5,8,3,4,3,6,9,4,4,2,1}; 
		System.out.println("Enter the number");
		int no=sc.nextInt();
		boolean present=false;
		
		
		for(int i =0;i<ar.length;i++)
		{
			if(no==ar[i])
			{
				System.out.println("Yes, we got the number in index "+i);
				
				 present=true;
				 break;
				
			}
							
		}
		
		if(present==false)
		{
			System.out.println("No,is not present");
		}
		
	}
	

}
