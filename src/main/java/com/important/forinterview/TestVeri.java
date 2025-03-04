package com.important.forinterview;

public class TestVeri {

	public static void main(String[] args) {
		
		//TestVeri.test();
		
		Test test = new Test();
	//	test.i=20;
	//	test.name="Hello";
		test.check();
		test.check();
		
		
		
	}
	
	
}

class Test
{
	
		final int i=5;
		final String name=null;
		//System.out.println(i+" "+name);
		
		public void check()
		{
			System.out.println(i+ " "+name);
		}
		
		
		private void check2()
		{
			System.out.println(i+ " "+name);
		}
	
}
