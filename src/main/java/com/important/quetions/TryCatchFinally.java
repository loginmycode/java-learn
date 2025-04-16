package com.important.quetions;

public class TryCatchFinally {

	public static void main(String[] args) {
		//tryFollowedByCatch(10);
		//tryCatchFinally(100);
		//tryFinally(100);
		tryFinally(100);
		
		
	}
	public static void tryFollowedByCatch(int num)
	{
		try
		{
		int res =num/0;
		System.out.println("Inside try block");
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println("inside catch block");
		}
	}
	
	public static void tryCatchFinally(int num)
	{
		try
		{
			int res =num/0;
			System.out.println("Inside try block");		
		}
		catch(Exception e)
		{
			System.out.println("inside catch block ");
		}
		finally
		{
			System.out.println("Inside finally Block");
		}
	}
	public static void tryFinally(int num)
	{
		try
		{
			int res =num/0;
			System.out.println("inside try block");
		}
		finally
		{
			System.out.println("Inside finally");
		}
		try
		{
			System.out.println("inside try block");
		}
		finally
		{
			System.out.println("Inside finally");
		}
		
		
	}
	 
	
	
}
