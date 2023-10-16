package Pattern;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberPattern np = new NumberPattern();
		
		//np.pattern1();
		//np.pattern2();
		//np.pattern3();
		np.pattern4();
		
		
		
	}

	private void pattern4() {
		// TODO Auto-generated method stub
	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		
		//case-1;
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//case-2;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=i;star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		
		//case=1
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");	
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(1+" ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//case-2;
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(j+" ");
				}
					
				else
				{
					System.out.print(1+" ");
				}
					
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//case-3
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");	
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(6-k+" ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//case-4
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");	
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
			
		}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
				
				
			}
			System.out.println();
		}
	}

}
