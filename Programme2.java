package task.org;

import java.util.HashSet;

public class Programme2 {

	public static void main(String[] args) {
		
		//Find the random method in math class giving dupicate value.when it gives duplicate value it should stop givng value.  
		
		HashSet hs = new HashSet();
		
		
		//System.out.println(d);
		
		while(true)
		{
			double d = Math.random();
			
			int val  = (int)(d*10);
			boolean added = hs.add(val);
			
			if(added == false)
					break;
		}
		System.out.println(hs);	
		
	}

}
