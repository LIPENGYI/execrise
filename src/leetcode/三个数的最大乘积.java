package leetcode;

import java.util.Arrays;

/*
 * 求三个数的最大乘积，要考虑数值为正还是为负。首
 * 先可以利用Arrays.sort()进行排序，得到最大值。如果最大值为负值，
 * 则数组中所有的值都为负值，最大的乘积就是最后三位数字的乘积；如果最大值为正值，
 * 则数组中可能存在负值，若都为正值，最大乘积为最后三位的乘积，若存在负值，可能最大值为最大数与前
 * 两位的乘积。
 * */
public class 三个数的最大乘积 {
	public int maximumProduct(int[] nums){
		Arrays.sort(nums);
		int len = nums.length;
		if(nums[len-1]<0){
			return nums[len-1]*nums[len-2]*nums[len-3];
		}
		int a = nums[len-1]*nums[len-2]*nums[len-3];
		int b = nums[len-1]*nums[0]*nums[1];
		return a>b? a:b;
		
	}
}
