package com.org;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringDemo sd = new StringDemo();
		int[] ar = {10,8,5,3,9,8,23,12,1};
		
	//	sd.find_biggest(ar);
		sd.Bubble_sort(ar);
	}

	

	private void Bubble_sort(int[] ar) {
		// TODO Auto-generated method stub
			
			
		    
		  for( int j = 1;j<ar.length;j++)
		    {
		    for(int i=0; i<ar.length-j; i++)
		      {
		        if(ar[i]>ar[i+1])
		        {
		          int temp = ar[i];
		          ar[i] = ar[i+1];
		          ar[i+1] = temp;
		        }
		      }
		    } 

		  for(int i=0; i<ar.length;i++)
		  {
		    System.out.print(ar[i]+ "  ");
		  }
		 
}
	
	private void find_biggest(int[] ar) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
				
			}	
		}
		System.out.println(ar[ar.length-1]);
		
	}

}
