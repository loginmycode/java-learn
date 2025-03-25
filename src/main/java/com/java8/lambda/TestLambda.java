package com.java8.lambda;

public class TestLambda {

	public static void main(String[] args) {
		
		ExampleCode exm =(int a, int b)-> 
		{
			return a+b;
		};
		System.out.println(exm.add(2, 5));
		
		ExampleCode exm1 =(int a,int  b)->(a+b); // without return
		System.out.println(exm.add(1, 3));
		
		
		
		ExampleCode  exm2 = (a,b)->(a+b);
		//int res =ex.add(2, 3);
		System.out.println(exm2.add(2, 3));
		
		
		
		
		FindLength word = str -> str.length();
		System.out.println("Length ot the string is  ="+word.findLength("abcd"));
		
		
		
	}
}
