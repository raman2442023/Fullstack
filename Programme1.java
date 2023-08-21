package task.org;

import java.util.ArrayList;

public class Programme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "I love you Java ,Java is one of the easiest programming languages.Java has more inbuilt libraies";
	
		 
		 //Case-1
		 
		ArrayList ar = new ArrayList();
		
		String[] ar1 = input.split(" ");
		
		for(String ss :ar1)
		{
			if(ss.equals("Java"))
				ar.add("Python");
			else
				ar.add(ss);
			
		}	System.out.println(ar); 
		
		
		// Case=2
		
		ArrayList arr = new ArrayList();
		
		arr.add("I");
		arr.add("Love");
		arr.add("Python");
		arr.add("Java");   
		arr.add("is");
		arr.add(" one");
		arr.add(" of ");
		arr.add("the ");
		arr.add("easiest ");
		arr.add("programming");
		arr.add("languages");
	
		
		boolean present = arr.contains("Java");
		if(present == true )
		{
			int position = arr.indexOf("Java");
			arr.add(position, "Python");
		}
		System.out.println(ar);
		
		
		//Case-3
		
		for(int i=0;i<=ar.size()-1;i++)
		{
		 if( arr.get(i).equals("Java"))
		 {
			 arr.set(i, "Python");
		 }
			
							
		}System.out.println(ar);
		
		}

}
