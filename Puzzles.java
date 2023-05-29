package com.org;

public class Puzzles {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puzzles puzzlesobj = new Puzzles();
		
		//puzzlesobj.dplan();
		//puzzlesobj.fplan();
		puzzlesobj.minister();
	}
	

	private void minister() {
		// TODO Auto-generated method stub
		int amt=1;
		int day=1;
		int total=0;
		while (day<=10)
		{
			System.out.println("This day"+day+"This amt"+amt);
			total=total+amt;
			amt=amt*2;
			day=day+1;
		}
		System.out.println("Total amt"+total); 
	}


	private void fplan() {
		// TODO Auto-generated method stub
		int day=1;
		int savings=0;
		while(day<=10)
		{
			savings += day;
			day +=1;
			System.out.println("daily"+savings);
		}
		System.out.println(savings);
	}
	

	private void dplan() {
		// TODO Auto-generated method stub
		int day =1;
		int pocket_money=5;
		int savings=0;
		while (day<=10)
		{
			savings=savings+pocket_money;
			day=day+1;
			
		}
		System.out.println(savings);
		
		
	}

}
