package ��ָOffer;

import java.util.*;

public class �����������ĵ�K���ڵ� {
	ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
	TreeNode KthNod(TreeNode pRoot,int k){
		if(pRoot ==null||k==0){
			return null;
		}
		inOrder(pRoot);
		TreeNode tr = pRoot;
		if(k<=arr.size()){
			tr = arr.get(k-1);
		}else{
			return null;
		}
		return tr;
		
	}
	public void inOrder(TreeNode root){
		if(root ==null){
			return;
		}
		if(root.left!=null){
			inOrder(root.left);
		}
		arr.add(root);
		if(root.right!=null){
			inOrder(root.right);
		}
	}
}
