package leetcode;

import java.util.Arrays;

public class 只出现一次的数字 {
	public int singleNumber(int[] nums){
		int n = nums.length;
		if(n<2){
			return nums[0];
		}else{
			Arrays.sort(nums);
			int j = 0;
			if(nums[j]!=nums[j+1]){
				return nums[0];
			}
			for(j = 1;j<n-1;j++){
				if(nums[j]!=nums[j-1]&&nums[j]!=nums[j+1]){
					return nums[j];
				}
			}
			return nums[j];
		}
		//return nums[j];
		
	}
}
