package com.org;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		
		calc.find_frequency();
	}

	private void find_frequency() {
		// TODO Auto-generated method stub
		
		char[] name= {'r','a','m','a','n'};
		
		for(int j=0;j<name.length;j++)
		{
			char ch =name[j];
			if( ch !='*')
			{
				int count=1;
				for(int i=j+1;i<name.length;i++)
				{
					if(ch == name[i])
					{
						name[i]='*';
						count++;
					}
				}
				System.out.println(ch +" appers "+count+"times");
			}
				
				
		}
		
	}

}
