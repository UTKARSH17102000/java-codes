package stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner (System.in);
     
		String str = scn.next();
     System.out.println(isBalanced(str));
	}
	
	public static boolean isBalanced(String str)
	{
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)== '{' ||str.charAt(i)== '[' || str.charAt(i)== '(' )
			{
	                stack.push(str.charAt(i));			
			}
			else if (str.charAt(i)== '}' ||str.charAt(i)== ']' || str.charAt(i)== ')')
			{
				if(stack.isEmpty()) 
					return false;
				if(str.charAt(i)== '}')
				{
				 if(stack.peek()=='{')
				{
					stack.pop();	
				}
				 else
				 {
					 return false;
				 }
				}
				if(str.charAt(i)== ']')
				{
				 if(stack.peek()=='[')
				{
					stack.pop();	
				}
				 else
				 {
					 return false;
				 }
				}
				if(str.charAt(i)== ')')
				{
				 if(stack.peek()=='(')
				{
					stack.pop();	
				}
				 else
				 {
					 return false;
				 }
				}
				
			}
			else {}
		}
		if(stack.isEmpty())
		{
			return true;
		}
		else
			return false;

	}

}
