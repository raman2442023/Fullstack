package loop.pratice;

public class ArrayExe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ArrayExe1 ar = new ArrayExe1();
		
		//ar.lenear_search();
		ar.reverse();
	}
	

	private void lenear_search() {
		// TODO Auto-generated method stub
		
		int[] ar= {2,3,5,2,4,3};
		int num=2;
		boolean present=false;
		
		
		for(int i=0;i<ar.length;i++)
		{
			if(num==ar[i])
			{
				System.out.println("Yes");
				present=true;
				
				break;
			}
		}
		if(present==false)
			System.out.println("no");	
	
			
	}

	private void reverse() {
		// TODO Auto-generated method stub
		
		int[] name= {1,2,3,4,5};
				
			//i        j
		//name[0]=name2[4]
		//name[1]=name2[3]
		//name[2]=name2[2]
		//name[3]=name2[1]
		//name[4]=name2[0]		
		
		int[] name2=new int [name.length]; 
		
		int i=0;
		int j=name.length-1;
		
		while(i<name.length-1)
		{
			name2[j]=name[i];
			i++;
			j--;
			
		}
		System.out.println(name2[i]);
	}

}
