package loop.org;

public class LoopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoopingDemo ld =  new LoopingDemo();
		
		//ld.pattern1();
		//ld.pattern2();
		//ld.print_I();
		//ld.print_T();
		//ld.print_star()
		//ld.print_C();
		//ld.print_O();
		//ld.print_V();
		//ld.print_Y();
		//ld.print_M();
		//ld.print_N();
		//ld.print_X();
		ld.print_Y2();
	}

	private void print_Y2() {
		// TODO Auto-generated method stub
		  for(int line = 1; line<=7;line++)
		    {
		        for(int star = 1; star<=7; star++)
		        {
		        if(line<=4) 
		        {
		          if(star==line || star==8-line)
		            {
		            
		              System.out.print("* ");
		            }
		            else
		            {
		                System.out.print("  "); 
		            }
		        }
		        else
		        {
		          if(star==8-line)
		            System.out.print("* ");
		          else
		            System.out.print("  "); 
		        }
		        }
		        System.out.println(); 
		    } 
		    
	}

	private void print_X() {
		// TODO Auto-generated method stub
		
		for (int line=1;line<=7;line++)
		{
			for(int star=1;star<=7;star++)
			{
				if(star==line || star==8-line)
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

	private void print_N() {
		// TODO Auto-generated method stub
		
		for(int line=1;line<=7;line++)
		{
			for(int star=1;star<=7;star++)
			{
				if(star==line || star==1 || star==7)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	private void print_M() {
		// TODO Auto-generated method stub
		 for(int line = 1; line<=7;line++)
		    {
		        for(int star = 1; star<=7; star++)
		        {
		          if(line<=4)
		          {
		            if(star==line || star==8-line || star==1 || star==7)
		            {
		              System.out.print("* ");
		            }
		            else
		            {
		                System.out.print("  "); 
		            }
		          }
		          else
			        {
			        	if(star==1 || star==7)
			        	{
			        	System.out.print("* ");
			        	}
			        	else
			        	{
			        		System.out.print("  ");
			        	}
			        }
		        }
		        
		        System.out.println();
		    }
	}

	private void print_Y() {
		// TODO Auto-generated method stub
		 for(int line = 1; line<=9;line++)
		    {
		        for(int star = 1; star<=7; star++)
		        {
		          if(line<=4)
		          {
		            if(star==line || star==8-line)
		            {
		              System.out.print("* ");
		            }
		            else
		            {
		                System.out.print("  "); 
		            }
		          }
		          else
		          {
		            if(star==4)
		            	System.out.print("* ");
		           else
		            	System.out.print("  ");
		          }
		      
		        }
		        System.out.println(); 
		    } 
	}

	private void print_V() {
		// TODO Auto-generated method stub
		
	    for(int line = 1; line<=9;line++)
	    {
	        for(int star = 1; star<=7; star++)
	        {
	          if(line<=4)
	          {
	            if(star==line || star==8-line)
	            {
	              System.out.print("* ");
	            }
	            else
	            {
	                System.out.print("  "); 
	            }
	          }
	      
	        }
	        System.out.println(); 
	    } 
	}

	private void print_O() {
		// TODO Auto-generated method stub
		
		for(int row = 1; row<=9; row++)
	       { //row=2 1<=9
	        if(row==1 || row==9)
	        {
	            for(int col = 1; col<=9; col++)
	            {
	                System.out.print("* "); 
	            }
	        }
	        else
	        {
	            System.out.print("*"); 
	            for(int space=1;space<=15; space++)
	            {
	              System.out.println(" ");
	            }
	        }
	        
	    }
		
		 
	       
}		
	        

	private void print_C() {
		// TODO Auto-generated method stub
		
		  for(int row = 1; row<=9; row++)
	       {
	        if(row==1 || row==9)
	        {
	            for(int col = 1; col<=9; col++)
	            {
	                System.out.print("* "); 
	            }
	        }
	        else
	        {
	            System.out.print("* "); 
	        }
	        System.out.println(); 
	      }
	}

	private void print_star() {
		// TODO Auto-generated method stub
		for(int row = 1; row<=9; row++)
		   {
		    for(int col = 1; col<=9; col++)
		    {
		        System.out.print("* "); 
		    }
		    System.out.println(); 
		   }
	}

	private void print_T() {
		// TODO Auto-generated method stub
		
		for(int star=1; star<=7; star++)
	    {
	    System.out.print("* "); 
	    }
	    System.out.println(); 
	    for(int star=1; star<=6; star++)
	    {
	      for(int space=1; space<=6; space++)
	      {
	        System.out.print(" ");
	      }
	    System.out.println("* ");
	    }
	}

	private void print_I() {
		// TODO Auto-generated method stub
		
		for(int star=1; star<=7; star++)
		{
		System.out.print("* "); 
		}
		System.out.println(); 
		for(int star=1; star<=6; star++)
		{
			for(int space=1; space<=6; space++)
		      {
		        System.out.print(" ");
		      }
		    System.out.println("* ");
		}
		for(int star=1; star<=7; star++)
		{
		System.out.print("* "); 
		}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		
		  for(int star=1; star<=7; star++)
		    {
		      System.out.print("* ");
		    }
		    System.out.println();
		    for(int star=1; star<=6; star++)
		    {
		      System.out.println("* ");
		    }
		    for(int star=1; star<=7; star++)
		    {
		      System.out.print("* ");
		    }
		  
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		
		   for(int row = 1; row<=3;row++)
		      {
		      for(int col=1; col<=7; col++)
		      {
		        System.out.print("* ");
		      }
		      System.out.println();
		      }    
		  
	}
	

}
