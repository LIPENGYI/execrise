package leetcode;

import java.util.LinkedList;
import java.util.List;

public class ȫ���� {
	List<List<Integer>> res;
	public List<List<Integer>> permute(int[] nums){
		res = new LinkedList<List<Integer>>();
		helper(nums,0);
		return res;	
	}
	public void helper(int[] nums,int i){
		//�ҵ�ת����ɺ�Ľ⣬��������б���
		if(i == nums.length-1){
			List<Integer> list = new LinkedList<Integer>();
			for(int j = 0;j<nums.length;j++){
				list.add(nums[j]);
			}
			res.add(list);
		}
		//����ǰλ�õ����������������
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
