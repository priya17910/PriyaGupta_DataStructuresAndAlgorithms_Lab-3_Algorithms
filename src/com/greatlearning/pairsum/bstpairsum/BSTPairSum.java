package com.greatlearning.pairsum.bstpairsum;

import java.util.HashSet;

import com.greatlearning.pairsum.treenode.TreeNode;

/* METHOD TO CALCULATE PAIR SUM IN A BINARY SEARCH TREE */
public class BSTPairSum {
	
	/* MAIN LOGIC TO CALCULATE BST PAIR SUM STARTS HERE */
	private boolean findPairWithSumUtil (TreeNode node, HashSet<Integer> set, int targetSum)
	{
		if (node == null)
		{
			return false;
		}
		if (findPairWithSumUtil (node.leftNode, set, targetSum))
		{
			return true;
		}
		int complement = targetSum - node.info;
		if (set.contains(complement))
		{
			System.out.println ("Pair is (" + node.info + ", " + complement + ")");
			return true;
		}
		else
		{
			set.add(node.info);
		}
		return findPairWithSumUtil (node.rightNode, set, targetSum);
	}
	/* MAIN LOGIC TO CALCULATE BST SUM PAIR ENDS HERE */
	
	public void findPairWithSum (TreeNode root, int targetSum)
	{
		HashSet<Integer> set = new HashSet<>();
		if (!findPairWithSumUtil (root, set, targetSum))
		{
			System.out.println ("Nodes are not found");
		}
	}
}
