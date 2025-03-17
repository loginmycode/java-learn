package com.gc;

public class Test1 {

	public static void main(String[] args)  {
		
		Test1 t= new Test1();
	//	t.finalize();
	//	t.finalize();
		t=null;
		System.gc();
		System.out.println("main ended");
	}
	
	public void finalize()
	{
		System.out.println("finalize method");
	}
	
}
