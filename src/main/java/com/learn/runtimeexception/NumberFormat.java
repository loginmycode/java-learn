package com.learn.runtimeexception;

public class NumberFormat {

	public static void main(String[] args) {
		
		try
		{
		int n1 =Integer.parseInt(args[0]);
		System.out.println(n1);
		}
		catch (NumberFormatException e) {
			System.out.println("Input should be only number");
			// TODO: handle exception
		}
		finally {
			
			System.out.println("The process has been complited");
		}
		
	
	}
	
}
