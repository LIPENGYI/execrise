package leetcode;

import java.util.Arrays;

public class ����������� {
	public int thirdMax(int[] nums){
		if(nums.length<3){
			Arrays.sort(nums);
			return nums[nums.length-1];
		}
		return 0;
		
	}
}
