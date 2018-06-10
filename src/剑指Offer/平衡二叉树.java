package ½£Ö¸Offer;

public class Æ½ºâ¶þ²æÊ÷ {
	public boolean IsBalanced_Solution(TreeNode root){
		if(root == null)
			return true;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		int diff = left - right;
		if(diff>1||diff<-1){
			return false;
		}
		return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);	
	}
	public int treeDepth(TreeNode root){
		if(root == null)
			return 0;
		if(root.left == null&& root.right == null)
			return 1;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		
		return left>right? left+1:right+1;
		
	}
}
