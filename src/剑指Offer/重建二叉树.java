package 剑指Offer;

public class 重建二叉树 {

	public static void main(String[] args) {
		int[] pre ={1,2,4,7,3,5,6,8};
		int[] in= {4,7,2,1,5,3,8,6};
		TreeNode tree = re(pre,0,7, in,0, 7);
		System.out.println(tree);
	}
	public static TreeNode re(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
		if(startPre>endPre||startIn>endIn){
			return null;
		}
		TreeNode root = new TreeNode(pre[startPre]);
		for(int i=startIn;i<endIn;i++){
			if(in[i]==pre[startPre]){
				root.left=re(pre,startPre,endPre, in,startIn, i-1);
				root.right=re( pre,startPre, endPre, in, i+1, i-1);
			}
		}	
		return root;
	}

}

