package leetcode;
//remove_elment
/**
 * Given an array and a value, remove all instances of that value in place and return 
 * the new length. The order of elements can be changed. It doesn't matter what you leave beyond 
 * the new length.
 * @author Administrator
 *
 */
public class remove_element {
	public int removeElement(int[] A,int elem){
		int len =0, n = A.length;
		for(int i=0;i<n;i++){
			if(A[i]!=elem){
				A[len++] = A[i];
			}
		}
		return len;
	}
}
