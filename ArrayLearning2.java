package com.org;

public class ArrayLearning2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayLearning2 al = new ArrayLearning2();
		
		al.find_next_big();
		
		char[] name= {'r','a','m','a','n'};
		al.fian_a(name);
		
		al.find_palindrome();
	}

	private void find_palindrome() {
		// TODO Auto-generated method stub
		char[] name= {'a','p','p','a'};
		int count=0;
		
		int len=name.length-1;
		int i=0;
		
		while(i<len)
		{
			char first =name[i];
			char last=name[len];
			if(first==last)
			{
				count++;
			}
			else
			{
				System.out.println("Not palindrome");
				break;
			}
			
		}
	}

	private void fian_a(char[]name) {
		// TODO Auto-generated method stub
		
		char ch='m';
		int count=0;
		
		for(int i=0;i<name.length;i++)
		{
			if(ch==name[i]);
			count=count+ch;
		}
		System.out.println("Count " +ch+" " +"is "+count);
	}
	

	private void find_next_big() {
		// TODO Auto-generated method stub
		
		int[] ar= {4,8,6,9};
		
		
		
for(int j=0;j<ar.length;j++)
{
		int no=ar[j];
		int big =100;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>no) 
			{
				if(ar[i]<big)
				{
					big=ar[i];
				}
			}
		}
		System.out.println(no+"--->"+big);
		if(no==big)
		{
			
		}
	}	
	
	

}
}