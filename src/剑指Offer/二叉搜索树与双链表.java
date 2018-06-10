package 剑指Offer;

public class 二叉搜索树与双链表 {
	public TreeNode Convert(TreeNode root){
		if(root == null)
			return null;
		if(root.left ==null&&root.right==null){
			return root;
		}
		//将左子数构造成双链表，并返回链表头结点
		TreeNode left = Convert(root.left);
		TreeNode p = left;
		//定位到左子树的双链表最后一个节点
		while(p!=null&&p.right!=null){
			p = p.right;
		}
		//如果左边子树不为空的话，将当前root追加到做紫薯的链表上
		if(left!=null){
			p.right = root;
			root.left = p;
		}
		//将右子数构造成双链表，并返回链表头结点
		TreeNode right = Convert(root.right);
		//如果右子树链表不为空的话，将链表追加到root节点之后
		if(right!=null){
			right.left = root;
			root.right = right;
		}
		return left!=null?left:root;
		
	}
}
