package leetcode;

public class search_in_rotated_sorted_array {
	public int search(int[] ary,int target){
		int len = ary.length;
		int left = 0;
		int right = len -1;
		while(left<right){
			int mid = (left+right)/2;
			if(ary[left] == target) return left;
			if(ary[right]== target) return right;
			if(ary[mid] == target) return mid;
			if(ary[left]<=ary[mid]){
				if(target>ary[left]&&target<ary[mid]){
					left+=1;
					right = mid-1;
				}else{
					left = mid+1;
					right-=1;
				}
			}else{
				if(target>ary[mid]&&target<ary[right]){
					left = mid+1;
					right-=1;
				}else{
					left+=1;
					right = mid-1;
				}
			}
		}
		return -1;
		
	}
}
