package com.learn.runtimeexception;

public class IOBException {

	public static void main(String[] args) {
		
		int [] arr = new int[2];
		try
		{
		
		for(int i=0; i<arr.length+1; i++)
		{
			System.out.println(arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			/*
			 * System.out.println(e.getLocalizedMessage());
			 * System.out.println(e.getCause()); System.out.println(e.getStackTrace());
			 * System.out.println(e.getSuppressed());
			 */
			
			System.out.println("Check the size of the array");
		}
		finally {
			System.out.println("Process has completed");
		}
	}
	
		
	
}
