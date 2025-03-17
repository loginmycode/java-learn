package com.gc;

public class FinalizeUsing {

	public static void main(String[] args) {
		
		String s= new String("Abc");
		System.out.println("main Startd");
		System.gc();
		System.out.println("main Ended");
		
		
	}
	
	public void finalize()
	{
		System.out.println("Gc exceuted");
	}
}
