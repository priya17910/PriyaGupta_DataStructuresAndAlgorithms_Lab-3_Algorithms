package com.greatlearning.pairsum.driver;

import java.util.Scanner;

import com.greatlearning.pairsum.bstpairsum.BSTPairSum;
import com.greatlearning.pairsum.treenode.TreeNode;

/* DRIVER CLASS */
public class Main {
	public static void main(String[] args) {
		// BST PAIR SUM CLASS OBJECT CREATION
		BSTPairSum tree = new BSTPairSum();
		int numOfValues = 0, val = 0, targetSum = 0;
		TreeNode root = null;
		Scanner sc = new Scanner (System.in);
		/* TAKING INPUT FROM USER STARTS HERE */
		System.out.println ("Enter the number of keys you want in your binary search tree");
		try
		{
			numOfValues = sc.nextInt();
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println ("Invalid Input. Please enter an integer.");
		}
		System.out.println ("Enter the " + numOfValues + " number of keys : ");
		try
		{
			val = sc.nextInt();
			// CREATING ROOT OF THE BINARY SEARCH TREE
			root = new TreeNode (val);
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println ("Invalid Input. Please enter an integer.");
		}
		for (int i = 1; i < numOfValues; i++)
		{
			try
			{
				val = sc.nextInt();
				root.insert(root, val);
			}
			catch (java.util.InputMismatchException e)
			{
				System.out.println ("Invalid Input. Please enter an integer.");
			}
		}
		System.out.println ("Enter the target sum : ");
		try
		{
			targetSum = sc.nextInt();
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println ("Invalid Input. Please enter an integer.");
		}
		/* TAKING INPUT FROM USER ENDS HERE */
		
		// CALLING BST PAIR SUM METHOD
		tree.findPairWithSum(root, targetSum);
		sc.close();
	}
}
