package ��ָOffer;

public class ����������� {
	public int TreeDepth(TreeNode root){
		if(root == null)
			return 0;
		int leftdepth = TreeDepth(root.left);
		int rightdepth = TreeDepth(root.right);
		int high = leftdepth>rightdepth? leftdepth+1:rightdepth+1;
		return high;
		
	}
}
