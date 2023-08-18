package task.org;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Password pp = new Password();
		boolean result=pp.password_validate();
		
		if(result)
		{
			System.out.println("Password Valid");
		}
		else
		{
			System.out.println("Password Invalid");
		}
	
	}
	
	private  boolean password_validate() {
		// TODO Auto-generated method stub
		String regex ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password");
		String pass = sc.nextLine();
		
		Pattern patternObj = Pattern.compile(regex);
		Matcher matchObj = patternObj.matcher(pass);
		
		return matchObj.matches();
		
		
					
	}		
	
}
