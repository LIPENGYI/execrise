package 剑指Offer;
/*class TreeNode{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	public TreeNode(int val){
		this.val = val;
//	}
}*/
public class 序列化二叉树 {
	public String Serialize(TreeNode root){
		StringBuffer str = new StringBuffer();
		if(root == null){
			str.append("#"+" ");
			return str.toString();
		}
		str.append(root.val+" ");
		str.append(Serialize(root.left));
		str.append(Serialize(root.right));
		return str.toString();
	}
	int index = -1;
	public TreeNode Deserialize(String str){
		String[] strArray = str.split(" ");
		TreeNode headNode = constructTree(strArray,strArray.length);
		return headNode;	 
	}
	public TreeNode constructTree(String[] strArray,int len){
		index++;
		if(index>=len)
			return null;
		TreeNode newNode = null;
		if(!strArray[index].equals("#")){
			newNode = new TreeNode(Integer.valueOf(strArray[index]));
			newNode.left = constructTree(strArray,len);
			newNode.right = constructTree(strArray,len);
		}
		return newNode;
		
	}
}
