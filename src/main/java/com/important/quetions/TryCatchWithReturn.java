package com.important.quetions;

public class TryCatchWithReturn {

	public static void main(String[] args) {
		//test();
		System.out.println(test());
		
	}
	
	public static String test()
	{
		try
		{
			int res =10/0;
			return "return try";
		}
		catch(Exception e)
		{
			return "return catch";
		}
		finally
		{
			return "return finally";
		}
	}
}
