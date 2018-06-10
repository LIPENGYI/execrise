package 剑指Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*class TreeNode{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	public TreeNode(int val){
		this.val = val;
	}
}*/
public class 从上往下打印二叉树 {
	

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if(root == null) 
			return arr;
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode t = queue.poll();
			arr.add(t.val);
			if(t.left!= null){
				queue.offer(t.left);
			}
			if(t.right!=null){
				queue.offer(t.right);
			}
		}
		return arr;
	}
}
