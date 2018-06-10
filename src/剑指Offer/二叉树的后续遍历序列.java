package 剑指Offer;

public class 二叉树的后续遍历序列 {
	public boolean VerifySquenceOfBST(int[] sequence){
		if(sequence == null || sequence.length<= 0){
			return false;
		}
		if(sequence.length == 1)
			return true;
		
		return VerifySquenceOfBSTCore(sequence,0,sequence.length-1);
		
	}
	public boolean VerifySquenceOfBSTCore(int[] sequence,int begin,int end){
		if(begin>=end){
			return true;
		}
		int root = sequence[end];
		int leftIndex = begin;
		for(;leftIndex<end&&sequence[leftIndex]<root;leftIndex++);
		int rightIndex = leftIndex;
		for(;rightIndex<end;rightIndex++){
			if(sequence[rightIndex]<root){
				return false;
			}
		}
		return VerifySquenceOfBSTCore(sequence,begin,leftIndex-1)
				&&VerifySquenceOfBSTCore(sequence,rightIndex,end -1);
		
	}
}
