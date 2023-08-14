package com.org;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearningRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "My mobile number is 6385394688";
		
		Pattern patternobj = Pattern.compile("[0123456789]");
		Matcher mm = patternobj .matcher(st);
		while(mm.find())
		{
			System.out.print(mm.group());
			//System.out.println(mm.end());
			//System.out.println(mm.start());
		}
		
	}

}
