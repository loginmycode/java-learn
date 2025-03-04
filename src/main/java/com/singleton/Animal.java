package com.singleton;

public class Animal {

	public static Animal Single_Instance=null;
	
	private Animal(){}
	
	
	public static  Animal getInstance()
	{
		if(Single_Instance==null)
		{
			Single_Instance = new Animal();
		}
		return Single_Instance;
	}
	
	
	
}
