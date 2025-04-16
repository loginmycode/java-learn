package com.important.quetions;

import java.util.Scanner;

public class LargestPal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String word =sc.next();
		String hold,temp = "";
	
		for(int i=0; i<word.length(); i++)
		{
			for(int j=i+1; j<=word.length(); j++)
			{
				hold=word.substring(i,j);
				System.out.println(hold);
				if(new StringBuilder(hold).reverse().toString().equals(hold)&&hold.length()>temp.length())
				{
					 temp=hold;
				}
			}
			
			
		}
		System.out.println("res is ="+temp);
	}
}

