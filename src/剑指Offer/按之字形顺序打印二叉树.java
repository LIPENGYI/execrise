package 剑指Offer;

import java.util.ArrayList;
import java.util.Stack;

public class 按之字形顺序打印二叉树 {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
		ArrayList list = new ArrayList<ArrayList<Integer>>();
		if(pRoot ==null)
			return list;
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		s1.push(pRoot);
		ArrayList arr = new ArrayList<Integer>();
		while(true){
			while(s1.size()!=0){
				TreeNode node =(TreeNode)s1.pop();
				arr.add(node.val);
				if(node.left!=null)
					s2.push(node.left);
				if(node.right!=null){
					s2.push(node.right);
				}
			}
			list.add(arr);
			arr = new ArrayList<Integer>();
			if(s1.size()==0&&s2.size()==0){
				break;
			}
			while(s2.size()!=0){
				TreeNode node1 = (TreeNode)s2.pop();
				arr.add(node1.val);
				if(node1.right!=null){
					s1.push(node1.right);
				}
				if(node1.left!=null){
					s1.push(node1.left);
				}
			}
			list.add(arr);
			arr = new ArrayList<Integer>();
			if(s1.size()==0&&s2.size()==0)
				break;
		}
		return list;
		
	}
}
