package com.gc;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t=null;
		System.gc();
		System.out.println("End of main");
	}
	
	public void finalize()
	{
		System.out.println("Finalized method");
	}
}
