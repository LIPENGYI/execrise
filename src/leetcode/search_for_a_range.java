package leetcode;

public class search_for_a_range {
	public int[] searchRange(int[] A,int target){
		if(A==null||A.length ==0){
			return new int[]{-1,-1};
		}
		int start = -1;
		int end = -1;
		if(A[0]>target||A[A.length-1]<target){
			return new int[]{-1,-1};
		}
		for(int i=0;i<A.length;i++){
			if(A[i]==target){
				start = i;
				break;
			}
		}
		for(int i = A.length-1;i>=0;i--){
			if(A[i]==target){
				end  = i;
				break;
			}
		}
		return new int[]{start,end};
	}
}
