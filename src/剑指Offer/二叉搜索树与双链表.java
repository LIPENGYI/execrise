package ��ָOffer;

public class ������������˫���� {
	public TreeNode Convert(TreeNode root){
		if(root == null)
			return null;
		if(root.left ==null&&root.right==null){
			return root;
		}
		//�������������˫��������������ͷ���
		TreeNode left = Convert(root.left);
		TreeNode p = left;
		//��λ����������˫�������һ���ڵ�
		while(p!=null&&p.right!=null){
			p = p.right;
		}
		//������������Ϊ�յĻ�������ǰroot׷�ӵ��������������
		if(left!=null){
			p.right = root;
			root.left = p;
		}
		//�������������˫��������������ͷ���
		TreeNode right = Convert(root.right);
		//�������������Ϊ�յĻ���������׷�ӵ�root�ڵ�֮��
		if(right!=null){
			right.left = root;
			root.right = right;
		}
		return left!=null?left:root;
		
	}
}
