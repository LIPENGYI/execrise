package leetcode;



import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import ½£Ö¸Offer.TreeNode;

public class ÐÞ¼ô¶þ²æËÑË÷Êý {
	public TreeNode trimBST(TreeNode root,int L,int R){
		if(root == null)
			return null;
		if(root.val<L)
			return trimBST(root.right,L,R);
		if(root.val>R)
			return trimBST(root.left,L,R);
		root.left = trimBST(root.left,L,R);
		root.right = trimBST(root.right,L,R);
		return root;		
	//	Map<String,Integer> s = new ConcurrentHashMap<>(); 
	}
}
