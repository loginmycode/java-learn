package com.important.forinterview;

public class RemoveDots {

	public static void main(String[] args) {
		
		removeDots("Hel..lo");
		
	}
	public static void removeDots(String str)
	{
		int index = str.indexOf(".");
		
		while(index>0)
		{
			str= str.substring(0,index)+str.substring(index+1);
			index =str.indexOf(".");
		}
		
		System.out.println(str);
	}
}

