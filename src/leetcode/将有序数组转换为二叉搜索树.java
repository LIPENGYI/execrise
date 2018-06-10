package leetcode;

import ��ָOffer.TreeNode;

public class ����������ת��Ϊ���������� {
	TreeNode root = null;
	public TreeNode sortedArrayToBST(int[] nums){
		int left = 0;
		int right = nums.length-1;
		test(nums,left,right);
		return root;
	}
	//���ַ��ڿӽ���������--��֤��ƽ�������
	public void test(int[] nums,int left,int right){
		if(left<=right){
			int mid = (left+right)/2;
			insert(nums[mid]);
			//�ݹ�
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
