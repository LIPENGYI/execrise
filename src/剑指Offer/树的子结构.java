package 剑指Offer;

public class 树的子结构 {
	public boolean HasSubtree(TreeNode root1,TreeNode root2){
		if(root2 == null) return false;
		if(root1 ==null && root2!=null) return false;
		boolean flag = false;
		if(root1.val == root2.val){
			flag = isSubTree(root1,root2);
		}
		if(!flag){
			flag = HasSubtree(root1.left,root2);
			if(!flag){
				flag=HasSubtree(root1.right,root2);
			}
		}
		return false;	
	}
	private boolean isSubTree(TreeNode root1,TreeNode root2){
		if(root2 == null) return true;
		if(root1==null && root2!=null)return false;
		if(root1.val== root2.val){
			return isSubTree(root1.left,root2.right)&&isSubTree(root1.right,root2.right);
			
		}else
		{
			return false;
		}
	}
}
