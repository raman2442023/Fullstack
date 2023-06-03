package home.work;

public class Looping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping2 loopobj = new Looping2();
		loopobj.print_reverse(12345);
		loopobj.count_of_digits(12345);
    	loopobj.sum__of_digits(12345);
		loopobj.order_of_digits(12345);
	}

	private void order_of_digits(int num) {
		// TODO Auto-generated method stub
		int div=1000;
		while (num>0)
		{
			System.out.println(num/div+" ");
			num=num%div;
			div=div/10;
		}
			
	}

	private void sum__of_digits(int num) {
		// TODO Auto-generated method stub
		
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

	private void count_of_digits(int num) 
	{
		// TODO Auto-generated method stub
		
		int count =0;
		while(num>0)
		{
			num=num/10;
			count=count+1;
		
		}System.out.println(count);
	}

	private void print_reverse(int num) 
	{
		// TODO Auto-generated method stub
		while(num>0)
		{
			System.out.println(num%10);
			num=num/10;
		}
	}

}
