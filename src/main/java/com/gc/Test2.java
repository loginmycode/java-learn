package com.gc;

public class Test2 {

	static int count=0;
	public static void main(String[] args) {
		int count=0;
		for(int  i=0; i<1000000; i++)
		{
			Test2 t= new Test2();
			t=null;
		}
	}
	
	public void finalize()
	{
		count++;
		System.out.println("finalize ="+count);
	}
}
