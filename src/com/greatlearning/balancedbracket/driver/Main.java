package com.greatlearning.balancedbracket.driver;


import java.util.Scanner;

import com.greatlearning.balancedbracket.checkbalancefunction.BalancedBrackets;
/* DRIVER CLASS */
public class Main {

	public static void main(String[] args) {
		// CREATING BALANCED BRACKET CLASS OBJECT
		BalancedBrackets balancedBracketObject = new BalancedBrackets();
		// TAKING INPUT STRING from user
		String input1;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter the input string : ");
		input1 = sc.nextLine();
		// CALLING BALANCED BRACKET UTIL METHOD
		balancedBracketObject.balancedBracketUtil (input1);
		sc.close();
	}
}
