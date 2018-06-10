package leetcode;

import java.util.ArrayList;
import java.util.*;

import 剑指Offer.TreeNode;

public class 二叉树的前序遍历 {
	public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<>();
		if(root == null){
			return list;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			//出栈
			TreeNode node = stack.pop();
			list.add(node.val);
			//访问右子树
			if(node.right!=null){
				stack.push(node.right);
			}
			//左子树
			if(node.left!=null){
				stack.push(node.left);
			}
		}
		return list;	
	}
}
