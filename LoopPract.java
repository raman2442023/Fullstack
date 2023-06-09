package loop.org;

public class LoopPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopPract problems = new LoopPract();
		//problems.pro1(12345);
		//problems.pro2(12345);
		//problems.pro3(12345);
		problems.pro4(1234);
		
	}

	private void pro4(int i) {
		// TODO Auto-generated method stub
		int div=1000;
		while(i>0)
		{
			System.out.println(i%div);
			i=i%div;
			div=div/10;
			//System.out.println(reverse);
		}
		
		
	}

	private void pro3(int i) {
		// TODO Auto-generated method stub
		int sum=0;
		while (i>0)
		{
			int rem=i%10;
			sum=sum+rem;
			i=i/10;
		}
		System.out.println(sum);
	}

	private void pro2(int i) 
	{
		// TODO Auto-generated method stub
		int count=0;
		while (i>0)
		{
			i=i/10;
			count=count+1;
		}
		System.out.println(count);
	}

	private void pro1(int num) {
		// TODO Auto-generated method stub
		while (num>0)
		{
			System.out.println(num%10);
			num=num/10;
		}
	}

}
