package com.greatlearning.pairsum.treenode;

public class TreeNode {
	/* BASIC STRUCTURE OF NODE STARTS HERE */
	public int info;
	public TreeNode leftNode;
	public TreeNode rightNode;
	public TreeNode (int info)
	{
		this.info = info;
		leftNode = rightNode = null;
	}
	/* BASIC STRUCTURE OF NODE ENDS HERE */
	
	/* METHOD TO INSERT KEYS IN THE BINARY SEARCH TREE STARTS HERE */
	public TreeNode insert (TreeNode root, int key)
	{
		if (root == null)
		{
			root = new TreeNode (key);
			return root;
		}
		if (key < root.info)
		{
			root.leftNode = insert (root.leftNode, key);
		}
		else if (key > root.info)
		{
			root.rightNode = insert (root.rightNode, key);
		}
		return root;
	}
	/* METHOD TO INSERT KEYS IN THE BINARY SEARCH TREE ENDS HERE */
}
