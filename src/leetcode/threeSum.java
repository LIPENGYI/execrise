package leetcode;
import java.util.*;
public class threeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] nums){
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		int len = nums.length;
		if(len<=2)
			return lists;
		Arrays.sort(nums);
		for(int i = 0;i<len-2;++i){
			int start = i+1;
			int end = len-1;
			while(start<end){
				if(nums[start]+nums[end]+nums[i]<0){
					start++;
				}else if(nums[start]+nums[end]+nums[i]>0){
					end--;
				}else{
					ArrayList<Integer> array = new ArrayList<Integer>();
					array.add(nums[i]);
					array.add(nums[start]);
					array.add(nums[end]);
					if(!lists.contains(array))
						lists.add(array);
					start++;
					end--;
				}
			}
		}
		return lists;		
	}
}
