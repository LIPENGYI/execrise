package leetcode;

import 剑指Offer.TreeNode;

public class 二叉树的直径 {
	int diameter = 0;
	public int diameterOfBinaryTree(TreeNode root){
		getDepth(root);
		return diameter;
		
	}
	public int getDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		int temp  = left+right;
		if(temp>diameter){
			diameter = temp;
		}
		return Math.max(left, right)+1;
		
	}
}
