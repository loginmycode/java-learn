package com.learn.runtimeexception;

public class NullPointerEx {

	public static void main(String[] args) {
		
		String s = null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Pass the value to string \n"+ e.getMessage());
		}
	}
}
