package home.work;

public class Amstrong 
{

	public static void main(String[] args) {
		
		Amstrong problems = new Amstrong();
		int num=163646;
		
		int count_result=problems.count_of_diviser(num);
		int sum=problems.get_each_digits(num,count_result);
		
		if (sum==num)
		{
			System.out.println("Its a Amstrong number");
			
		}
		else
		{
			System.out.println("Its Not Amstrong");
		}
		
		
		
		
	}

	private int find_power(int base, int power) {
		// TODO Auto-generated method stub
		int result=1;
		while (power>0)
		{
			result=result*base;
			power=power-1;
		}
		return result;
	}

	private int get_each_digits(int num,int count) 
	{
		// TODO Auto-generated method stub
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			int result=find_power(rem,count);
			sum=sum+result;
			
			
		}return sum;
		
		
	}

	private int count_of_diviser(int num) 
	{
		// TODO Auto-generated method stub
		int count=0;
		while (num>0)
		{
			int rem=num%10;
			count=count+1;
			num=num/10;
			
		}//System.out.println(count);
		return count;
	}
	

}
