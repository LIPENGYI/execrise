package 剑指Offer;

import java.util.*;

public class 二叉树中和为某一值的路径 {
	public void func(ArrayList<ArrayList<Integer>>list,TreeNode node,int sum,
			ArrayList<Integer> rount,int target){
		if(sum<target){
			if(node.left!=null){
				ArrayList<Integer> r = (ArrayList<Integer>)rount.clone();
				r.add(node.left.val);
				func(list,node.left,sum+node.left.val,r,target);
			}
			if(node.right!=null){
				ArrayList<Integer> r = (ArrayList<Integer>)rount.clone();
				r.add(node.right.val);
				func(list,node.right,sum+node.right.val,r,target);
			}
		}else if(sum == target){
			if(node.left == null && node.right == null){
				list.add((ArrayList<Integer>)rount.clone());
			}
		}
	}
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(root == null || target<=0){
			return res;
		}
		ArrayList<Integer> rount = new ArrayList<Integer>();
		rount.add(root.val);
		func(res,root,root.val,rount,target);
		return null;
	}
}
