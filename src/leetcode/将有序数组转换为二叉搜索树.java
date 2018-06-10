package leetcode;

import 剑指Offer.TreeNode;

public class 将有序数组转换为二叉搜索树 {
	TreeNode root = null;
	public TreeNode sortedArrayToBST(int[] nums){
		int left = 0;
		int right = nums.length-1;
		test(nums,left,right);
		return root;
	}
	//二分法挖坑建立二叉树--保证是平衡二叉树
	public void test(int[] nums,int left,int right){
		if(left<=right){
			int mid = (left+right)/2;
			insert(nums[mid]);
			//递归
			test(nums,left, mid-1);
			test(nums,mid+1,right);
		}
	}
	public void insert(int val) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(val);
		if(root == null){
			root = node;
		}else{
			TreeNode current = root;
			TreeNode parent;
			while(true){
				parent = current;
				if(val<parent.val){
					current = parent.left;
					if(current == null){
						parent.left = node;
						return;
					}
				}else{
					current = parent.right;
					if(current == null){
						parent.right = node;
						return ;
					}
				}
			}
		}
	}
}
