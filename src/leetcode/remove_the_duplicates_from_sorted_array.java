package leetcode;

public class remove_the_duplicates_from_sorted_array {
	public int removeDuplicates(int[] A){
		int nexIndex = 0;
		int index =0;
	
		while(index<A.length){
			A[nexIndex] = A[index];
			
			while(index<A.length&&A[index]==A[nexIndex]){
				index++;
			}
			nexIndex++;
		}
		return nexIndex;
	}
}
