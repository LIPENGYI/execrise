package leetcode;
/**
 * There are two sorted arrays A and B of size m and n respectively. 
 * Find the median of the two sorted arrays. The overall run time complexity 
 * should be O(log (m+n)).
 * @author Administrator
 *
 */
public class findMedianSortedArrays {
	public double findMedianSortedArrays(int A[],int B[]){
		double median_fir = 0;
		int m = A.length,n = B.length;
		if(A == null||B == null||m+n ==0){
			return 0;
		}
		int indexA = 0,indexB = 0;
		while(indexA+indexB != (m+n+1)/2){
			int a =(indexA ==m)? Integer.MAX_VALUE:A[indexA];
			int b =(indexB ==n)? Integer.MAX_VALUE:B[indexB];
			if(a<b){
				median_fir =a;
				indexA++;
			}
			else{
				median_fir = b;
				indexB++;
			}
		}
		if((m+n)%2 ==1){
			return median_fir;
		}
		else{
			int temp_a = (indexA == m)? Integer.MAX_VALUE:A[indexA];
			int temp_b = (indexB==n)? Integer.MAX_VALUE:B[indexB];
			double median_sec = (temp_a<temp_b)? temp_a:temp_b;
			return (median_fir +median_sec)/2;
		}
	}
}
