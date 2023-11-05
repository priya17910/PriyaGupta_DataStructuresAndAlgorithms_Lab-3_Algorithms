package com.greatlearning.balancedbracket.checkbalancefunction;

import java.util.Stack;

public class BalancedBrackets {
	/* METHOD WITH BALANCED BRACKETS LOGIC - USING STACK DATA STRUCTURE */
	private boolean areBracketsBalanced (String input)
	{
		// CREATING STACK CLASS OBJECT
		Stack<Character> stack = new Stack<>();
		/* LOGIC STARTS HERE */
		for (char bracket : input.toCharArray())
		{
			if (bracket == '(' || bracket == '[' || bracket == '{')
			{
				stack.push(bracket);
			}
			else if (bracket == ')' || bracket == ']' || bracket == '}')
			{
				if (stack.isEmpty())
				{
					return false;
				}
				else
				{
					char openBracket = stack.pop();
					if (!isMatchingPair(openBracket, bracket))
					{
						return false;
					}
				}
			}
		}
		/* LOGIC ENDS HERE */
		return stack.isEmpty();
	}
	/* UTIL METHOD */
	public void balancedBracketUtil (String input)
	{
		if (areBracketsBalanced(input))
		{
			if (input.isEmpty())
			{
				System.out.println ("The entered input String is empty");
			}
			else
			{
				System.out.println (input + " ---> " + "The entered String has Balanced Brackets");
			}
		}
		else
		{
			System.out.println (input + " ---> " + "The entered String does not contain Balanced Brackets");
		}
		System.out.println();
	}
	/* CHECK BRACKET MATCHING */
	private boolean isMatchingPair (char ch1, char ch2)
	{
		if ((ch1 == '(' && ch2 == ')') || (ch1 == '{' && ch2 == '}') || (ch1 == '[' && ch2 == ']'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
