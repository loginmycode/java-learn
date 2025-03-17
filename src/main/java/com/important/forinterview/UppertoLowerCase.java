package com.important.forinterview;

public class UppertoLowerCase {
	
	public static void main(String[] args) {
		
		String word ="Hello World";
		StringBuilder builder = new StringBuilder();
		
		for(char c:word.toCharArray())
		{
			if(Character.isUpperCase(c))
			{
				builder.append(Character.toLowerCase(c));
			}
			else
			{
				builder.append(Character.toUpperCase(c));
			}
		}
		System.out.println(builder);
	}

}
