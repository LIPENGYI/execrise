package leetcode;

import java.util.LinkedList;
import java.util.List;

public class 全排列 {
	List<List<Integer>> res;
	public List<List<Integer>> permute(int[] nums){
		res = new LinkedList<List<Integer>>();
		helper(nums,0);
		return res;	
	}
	public void helper(int[] nums,int i){
		//找到转置完成后的解，将其存入列表中
		if(i == nums.length-1){
			List<Integer> list = new LinkedList<Integer>();
			for(int j = 0;j<nums.length;j++){
				list.add(nums[j]);
			}
			res.add(list);
		}
		//将当前位置的数跟后面的数交换
		for(int j = i;j<nums.length;j++){
			swap(nums,i,j);
			helper(nums,i+1);
			swap(nums,i,j);
		}
	}
	public void swap(int[] nums,int i,int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	} 
}
