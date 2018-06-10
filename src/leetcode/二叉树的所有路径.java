package leetcode;

import java.util.ArrayList;
import java.util.List;

import 剑指Offer.TreeNode;

public class 二叉树的所有路径 {
	public List<String> binaryTreePaths(TreeNode root){
		List<String> list = new ArrayList<>();
		if(root == null){
			return list;
		}
		
		return null;
		
	}
	public void iterator(TreeNode root,List<String> list,String string){
		string+=root.val+" ";
		if(root.left == null && root.right == null){
			list.add(string.trim().replace(" ", "-v"));
		}
		if(root.left != null){
			iterator(root.left,list,string);
		}
		if(root.right != null){
			iterator(root.right,list,string);
		}
	}
}
