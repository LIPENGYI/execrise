package leetcode;

import ½£Ö¸Offer.TreeNode;

public class ·­×ª¶þ²æÊ÷ {
	public TreeNode invertTree(TreeNode root){
		if(root!=null){
			invertTreeNode(root);
		}
		return root;
		
	}
	public void invertTreeNode(TreeNode root){
		if(root!=null){
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			invertTree(root.left);
			invertTree(root.right);
		}
	}
}
