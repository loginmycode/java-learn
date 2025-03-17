package com.important.forinterview;

class ImmutableClass {


	private int id;
	private String name;
	
	private ImmutableClass(int id, String name)
	{
		this.name=name;
		this.id=id;
		
	}
	
	public static void main(String[] args) {
		
		ImmutableClass im = new ImmutableClass(1,"abc");
		
	} 
	
}
