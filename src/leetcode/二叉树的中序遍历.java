package leetcode;

import java.util.LinkedList;
import java.util.List;

import 剑指Offer.TreeNode;

public class 二叉树的中序遍历 {
	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> result = new LinkedList<>();
		LinkedList<TreeNode> stack = new LinkedList<>();
		TreeNode node = root;
		while(node != null || stack.isEmpty()){
			while(node != null){
				stack.addLast(node);
				node = node.left;
			}
			if(!stack.isEmpty()){
				node = stack.removeLast();
				result.add(node.val);
				node = node.right;
			}
		}
		System.out.println(result);
		return result;
	}
	String s ="abcd";
	char c = s.charAt(0);
}
