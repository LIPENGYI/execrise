package leetcode;

import ½£Ö¸Offer.TreeNode;

public class Æ½ºâ¶þ²æÊ÷ {
	public boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		int l = depth(root.left);
		int r = depth(root.right);
		if(Math.abs(l-r)<=1){
			if(isBalanced(root.left)&&isBalanced(root.right)){
				return true;
			}
		}
		return false;
	}
	public int depth(TreeNode root){
		if(root == null){
			return 0;
		}
		return Math.max(depth(root.left),depth(root.right))+1;
	}
}
