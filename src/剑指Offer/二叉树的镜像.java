package ��ָOffer;

import java.util.Stack;

/*public class �������ľ��� {
	public void Mirror(TreeNode root){
		if(root ==null||root.left ==null&&root.right ==null)
			return ;
		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		if(root.left!=null){
			Mirror(root.left);
		}
		if(root.right!=null){
			Mirror(root.right);
		}
	}
}*/
public class �������ľ���{
	public void Mirror(TreeNode root){
		if(root ==null||(root.right == null&&root.left ==null))
			return ;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			TreeNode node =s.pop();
			TreeNode nodeTemp = node.left;
			node.left = node.right;
			node.right = nodeTemp;
			if(node.left!=null){
				s.push(node.left);
			}
			if(node.right!=null){
				s.push(node.right);
			}
		}
		
	}
	
}
