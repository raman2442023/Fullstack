package home.work;

public class Loop 
{

	public static void main(String[] args) 
	{
		
		Loop problems = new Loop();
		//problems.pro1();
		//problems.pro2();
		//problems.pro3();
		int count=problems.pro4(17);
		problems.prime_number(count);
	}

	private void prime_number(int count) 
	{
		
		if (count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime");
		}
	}
	

	private int pro4(int num) 
	{
		int count = 0;
		int div=2;
		while (num>div)
		{
			if (num%div==0)
			{
				System.out.println(div);
				count+=1;
			}
			div=div+1;
		}System.out.println(count);
		return count;
		
	}

	private void pro3() 
	{
		int num = 0;
		while (num<=10)
		{
			num = (num +(1*3));
			System.out.println(num);
		}
	}

	private void pro2() 
	{
		int num=0;
		while (num<=10)
		{
			num=num+2;
			System.out.println(num);
		}
	}
	private void pro1() 
	{	
		int num=0;
		while (num<=10)
		{
			num=(num+1);
			
			System.out.println(num);
		}   
				
				
	}

}
