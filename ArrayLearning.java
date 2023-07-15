package com.org;

import java.util.Scanner;

public class ArrayLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayLearning al = new ArrayLearning();
		
		//al.leasson1();
		//char name[] = {'h','a','r','i','s','h'};
		
		//al.lesson2(name);
		
		
		char[] name= {'a','p','p','a'};
		//char[] name2=al.print_reverse(name);
		//if(name==name2)
	
		//al.find_total();
		al.find_expense();
		//al.concodnate();
	}

	private char[] print_reverse(char[] name) {
		// TODO Auto-generated method stub
		
		char[] name2=new char[name.length];
		
			//i       j
//		name2[0]=name[3];
//		name2[1]=name[2];
//		name2[2]=name[1];
//		name2[3]=name[0];
		int i=0 ,j=name.length-1;
		
		while(i<name.length)
		{
			name2[i]=name[j];
			i++;
			j--;
		}
		System.out.println(name2);
		return name2;
		
		
	}

	private void concodnate() {
		// TODO Auto-generated method stub
		
		int[] first = {90,76,87};
		int[]second= {56,98,45};
		
		
	}

	private void find_expense() {
		// TODO Auto-generated method stub
		
		int[] tour= {1000,1500,300,450};
		
		int[] trip= {343,400};
		int total=0;
		
		for (int i =0;i<tour.length;i++)
		{
			total=total+tour[i];
		}
		for(int i=0;i < trip.length;i++)
		{
			total=total + trip[i];
		}
		System.out.println("Total is "+total);
	}

	private void find_total() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.of subjects");
		int subjects = sc.nextInt();
		
		int []marks=new int [subjects];
		int total=0;
		int big=0;
		int small=101;
		
		for(int i=0;i<marks.length;i++)
		{
			
			System.out.println("Enter mark");
			
			marks[i] = sc. nextInt();
			if(marks[i]>big)
			{
				big=marks[i];
			}
			if(marks[i]<small)
			{
				small=marks[i];
			}
			total = total+marks[i];
			System.out.println(marks[i]);
		}
		System.out.println("Total"+total);
		System.out.println("The biggest"+big);
		System.out.println("The smallest"+small);
	}

	private void lesson2(char[] name) {
		// TODO Auto-generated method stub
		
		for(int i=5;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		
	}

	private void leasson1() {
		// TODO Auto-generated method stub
		
		char name [] = new char[6];
		
		name[0]='h';
		name[1]='a';
		name[2]='r';
		name[3]='i';
		name[4]='s';
		name[5]='h';
		
		//System.out.println(name[2]);
		
		int i=0;
		
		while(i<name.length)
		{
			System.out.println(name[i]);
			i++;
			
		}
		char first=name[0];
		
		int len=name.length;
		char last=name[len-1];
		
		if(first==last)
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}

}
