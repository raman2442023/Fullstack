package com.org;

public class TwoDimansionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoDimansionalArray td = new TwoDimansionalArray();
		
		//td.jagged_array();
		//td.newArray();
		//td.totalarray();
		//td.specifiArray();
		td.Addition_of_matrix();
	}

	private void Addition_of_matrix() {
		// TODO Auto-generated method stub
		
		int[][] a= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		System.out.println(a);
		
		int[][] b= {
				{90,80,70},
				{60,50,40},
				{30,20,10}	
		};
		
		
		int[][] c=new int[3][3];
		
		for(int row=0;row<c.length;row++)
		{
			for(int col=0;col<3;col++)
			{
				c[row][col]=a[row][col]+b[row][col];
				System.out.print(c[row][col]+" ");
			}
			System.out.println();
		}
		
		
	}
	private void specifiArray() {
		// TODO Auto-generated method stub
		int[][] marks= {
				
				{50,50,50,50,56},
				{50,50,51},
				{78,34,62,44}
		};
		
		//System.out.println(marks.length);

		
		
		for(int exam=0;exam<marks.length;exam++)
		{
			int total=0;int big=0;
			for(int sub=0;sub<marks[exam].length;sub++)
			{
				
				//System.out.print(marks[exam][sub]+" ");
				//total+=marks[exam][sub];
				if(sub==2)
				{
					System.out.println(big=marks[exam][sub]); 
				}
				
			}
			
			//System.out.println(big);
			System.out.println();
			
		}
	}

	private void totalarray() {
		// TODO Auto-generated method stub
		
int[][] marks= {
				
				{50,50,50,50,56},
				{50,50,51},
				{78,34,62,44}
		};
		
		//System.out.println(marks.length);

		
		
		for(int exam=0;exam<marks.length;exam++)
		{
			int total=0;int big=0;
			for(int sub=0;sub<marks[exam].length;sub++)
			{
				
				//System.out.print(marks[exam][sub]+" ");
				total+=marks[exam][sub];
				if(marks[exam][sub]>big)
				{
					big=marks[exam][sub];
				}
				
			}
			System.out.println(total);
			System.out.println(big);
			System.out.println();
			
		}
		
		
	}

	private void newArray() {
		// TODO Auto-generated method stub
		
		int[] quartely = {50,23,56};
		int[] half= {34,79,31};
		int[] anual={24,68,90};
		
		
	}

	private void jagged_array() {
		// TODO Auto-generated method stub
		
		int[][] marks= {
				
				{50,56,60,36,43},
				{57,90,12},
				{78,34,62,44}
		};
		
		//System.out.println(marks.length);
		
		for(int exam=0;exam<marks.length;exam++)
		{
			for(int sub=0;sub<marks[exam].length;sub++)
			{
				System.out.print(marks[exam][sub]+" ");
			}
			System.out.println();
		}
		
	}

}
