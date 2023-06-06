package loop.org;

public class Mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathematics mathsobj = new Mathematics(); 
		
//		mathsobj.find_ceil(34.6);
//		//mathsobj.find_sqr(36);
//		mathsobj.find_floor(45.36);
//		mathsobj.maxmin(46,68);
//		mathsobj.find_power(26,4);
//		double a =mathsobj.find_signum(-12);
//		System.out.println(a);
		//`1zAemathsobj.round(23.6);
		mathsobj.round1(56.3);
	}

	private void round1(double d)
	{
		int d1=(int)d;
		// TODO Auto-generated method stub
		
		if (d>0)
		{
		System.out.println((int)(d1=d1*10));
			
			System.out.println((int)(d1=d1%10));
			if (d>0.5)
			{
				System.out.println(d=d+1);
			}
		}
		
		
		
		
			
		
	
		
	}
	

	private void round(double d) 
	{
		// TODO Auto-generated method stub
		 int d1= (int)d;
		System.out.println(d1);
		if (d>0)
		{
			if ((d-d1)>(0.5))
			{
				System.out.println(d1=d1+1);
			}
			else
			{
			System.out.println(d1);
			}
	}
	}		

	private double find_signum(int no ) 
	{
		// TODO Auto-generated method stub
		
		if (no>0)
			return 1.0;
		else if (no<0)
			return -1.0;
		else
			return 0.0;
				
	}

	private void find_power(int a, int b) 
	{
		// TODO Auto-generated method stub
		int p=1;
		while (b>0)
		{
			p=p*a;  //
			b=b-1;
		}
		System.out.println(p);
	}

	private void maxmin(int num1, int num2) 
	{
		// TODO Auto-generated method stub
		if (num1>num2)
		{
			System.out.println("Max"+num1);
			
		}
		else
		{
			System.out.println("max"+num2);
		}
	}

	private void find_floor(double num) {
		// TODO Auto-generated method stub
		int num2 =(int)num;
		
		if (num2==num)
		{
			System.out.println(num);
		}
		else
		{
			System.out.println(num2=num2-1);
		}
	}

	private void find_sqr(int num) 
	{
		// TODO Auto-generated method stub
		

		int div=2;
		while (div<num/2)
		{
			if (num/div==div)
			{
				System.out.println("Square of" + num);
			}
			num=num+1;
		}
		}

	private void find_ceil(double num) {
		// TODO Auto-generated method stub
		
		int num2=(int)num;
		
		System.out.println(num2);
		if (num2==num)
		{
			System.out.println(num);
			
		}
		else
		{
			System.out.println(num2=num2+1);
		}
	}

}
