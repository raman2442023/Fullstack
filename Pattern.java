package loop.org;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pp = new Pattern()
;
		//pp.print_star();
		//pp.print_num();
		//pp.print_pattern3();
		//pp.print_num1();
		pp.print_num2();

		
	}

	private void print_num2() {
		// TODO Auto-generated method stub
		
		for(int line=1;line<=5;line++)
		{
			for(int num=1;num<=line;num++)
			{
				if(num<=line)
				{
					System.out.print(line+" ");
					
				}
				
				
			}
			
			System.out.println();
			
		}
	}

	private void print_num1() {
		// TODO Auto-generated method stub
		
		for(int line=5;line>=1;line--)
		{
			for(int no=1;no<=line;no++)
			{
				System.out.print(no+" " );  
			}
			for(int no=1;no<=6-line;no++)
				{
					System.out.print(no+" ");
				}
			System.out.println();
		}
	
	}

	private void print_pattern3() {
		// TODO Auto-generated method stub
		
		for(int limit=1;limit<=5;limit++)
		{
			for(int no=1;no<=limit;no++)
			{
				System.out.print(no+" ");
				
			}
			System.out.println();
		}
	}

	private void print_num() {
		// TODO Auto-generated method stub
		
		for(int line=1;line<=5;line++)
			
		{
			for(int num=1;num<=5;num++)
			{
				System.out.print(line+" ");
			}
			
		System.out.println();
			
			}
			
		}
	

	private void print_star() {
		// TODO Auto-generated method stub
		
		for(int star=1;star<=25;star++)
		{
			System.out.print("* ");
			if(star%5==0)
				
				System.out.println();
			}
			
		}
		
	

}
