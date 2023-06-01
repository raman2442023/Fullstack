package home.work;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping loopobj = new Looping();
		
		loopobj.diviser(100);
	}

	private void diviser(int no) {
		// TODO Auto-generated method stub
		
		int div=2;
		int count =0;
		while (div<no)
		{
			if (no%div==0)
			{
				System.out.println(div);
				count=count+1;
				
			}
		div= div+1;
		
	    }
		System.out.println(count);
}

}
