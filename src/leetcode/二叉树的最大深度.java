package leetcode;

import 剑指Offer.TreeNode;

public class 二叉树的最大深度 {
	public int maxDepth(TreeNode root){
		
		return root == null?0:(1+Math.max(maxDepth(root.left), maxDepth(root.right)));
		
	}
}
