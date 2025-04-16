package com.important.quetions;

public class MutableImmutable {

	public static void main(String[] args) {
		String str1= new String("Hello");
		str1 =str1.concat("World");
		System.out.println(str1);
		
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("World");
		System.out.println(sb);
		
		try
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}
}
