package com.important.quetions;

import java.util.Stack;

public class EqualOpenCloseorNot {

	public static boolean isEqualOrNot(String str)
	{
		
		Stack<Character> stack = new Stack<>();
		for(char ch:str.toCharArray())
		{
			
			if(ch=='c'||ch=='{'||ch=='[')
			{
				stack.push(ch);
			}
			else
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else
				{
					char pop=stack.pop();
					if(! matcchingPairs(pop, ch))
					{
						return false;
					}
				}
			}
		}
		return  stack.isEmpty();
		
	}

	private static boolean  matcchingPairs(char open, char close) {
		
		return (open =='(' && close == ')')||
			   (open =='{' && close == '}')||
			   (open == '['&& close == ']');
			    
		
	}
	
	public static void main(String[] args) {
		
		String str ="[{()}]";
		System.out.println(isEqualOrNot(str));
		
	}
}
