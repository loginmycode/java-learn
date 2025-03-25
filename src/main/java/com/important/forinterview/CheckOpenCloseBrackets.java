package com.important.forinterview;

import java.util.Stack;

public class CheckOpenCloseBrackets {

	
	    public static boolean isMatching(String str)
	    {
	    	Stack<Character> stack = new Stack<>();
	    	for(char ch : str.toCharArray())
	    	{
	    		if(ch=='{'||ch=='['||ch=='(')
	    		{
	    			stack.push(ch);//{{(
	    		}
	    		else
	    		{
	    			if(stack.isEmpty())
		    		{
		    			return false;
		    		}
	    			
	    			char top =stack.pop();
	    			if(!isMatchingPair(top, ch))
	    			{
	    				return false;
	    			}
	    			
	    		}
	    		
	    		
	    	}
			return stack.isEmpty();
	    }

		private static boolean isMatchingPair(char open, char close) {
			
			return  (open == '(' && close ==')')||
					(open == '{' && close =='}')||
					(open == '[' && close ==']');
			
		}
	    
		
		public static void main(String[] args) {
			
			String str ="{{()}}";
			System.out.println(isMatching(str));
			
		}
		
}
