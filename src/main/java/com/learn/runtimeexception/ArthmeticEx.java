package com.learn.runtimeexception;

public class ArthmeticEx {

	public static void main(String[] args) {
		
		
		
		try
		{
			int num =Integer.parseInt(args[0]);
			int num1 =Integer.parseInt(args[1]);
			
			System.out.println(num/num1);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally {
			System.out.println("process complited");
		}
	}
}
