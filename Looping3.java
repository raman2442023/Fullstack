package home.work;

public class Looping3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Looping3 looping = new Looping3();
		
		//System.out.println(find_fma(45,13,96));
		int num=23;
		int result=looping.revere_a_number(num);
		
		System.out.println("Number is"+result);
		if (num==result)
		{
			 System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not polindrome");
		}
	}

	

	private static int find_fma(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i*j+k;
	}

	private int revere_a_number(int num) 
	{
		// TODO Auto-generated method stub
		
		int reverse=0;
		while (num>0)
		{
			int rem = num%10; //2
			reverse=(reverse*10)+rem; //(2*10)+2
			num=num/10; //2
		
		}
		 return reverse;
		 
	
		
	}
	
}
