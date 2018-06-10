package leetcode;

import java.util.ArrayList;
import java.util.*;

import ��ָOffer.TreeNode;

public class ��������ǰ����� {
	public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<>();
		if(root == null){
			return list;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			//��ջ
			TreeNode node = stack.pop();
			list.add(node.val);
			//����������
			if(node.right!=null){
				stack.push(node.right);
			}
			//������
			if(node.left!=null){
				stack.push(node.left);
			}
		}
		return list;	
	}
}
