package leetcode;
/*
给定的二叉树最多有 100 个节点。
每个节点的值只会为 0 或 1 。
后续遍历
*/
import 剑指Offer.TreeNode;

public class 二叉树的剪枝 {
	public TreeNode pruneTree(TreeNode root){
		if(root == null)
			return null;
		root.left = pruneTree(root.left);
		root.right = pruneTree(root.right);
		if(root.left==null&&root.right==null&&root.val==0){
			return null;
		}
		return root;
	}
}
