package leetcode;

public class x的平方根 {
	public int mySqrt(int x){
		if(x<=1){
			return x;
		}
		int begin = 1;
		int end = x;
		int mid = 0;
		while(begin<=end){
			mid = begin+(end-begin)/2;
			if(mid==x/mid){
				return mid;
			}else{
				if(mid<x/mid){
					begin = mid+1;
				}else{
					end = mid-1;
				}
			}
		}
		return end;
		
	}
}
