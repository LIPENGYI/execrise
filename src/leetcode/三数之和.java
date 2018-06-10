package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 三数之和 {
	public List<List<Integer>> thredSum(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		if(nums!=null&&nums.length>2){
			Arrays.sort(nums);
			//i表示如果取第i个数作为结果
			for(int i=0;i<nums.length-2;){
				//第二个数可能的起始位置
				int j = i+1;
				//第三个可能的结束位置
				int k = nums.length-1;
				while(j<k){
					//如果找到满足条件的姐
					if(nums[j]+nums[k] == -nums[i]){
						List<Integer> list = new ArrayList<>(3);
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						result.add(list);
						//移动到下一个位置。找下一组姐
						k--;
						j++;
						//从左向右找第一个与之前处理的数不同的数的下标
						while(j<k&&nums[j] == nums[j-1]){
							j++;
						}
						//从右向左找第一个与之前处理的数不同的数的下标志
						while(j<k&&nums[k] == nums[k+1]){
							k--;
						}
					}
					else if(nums[j]+nums[k]>-nums[i]){
						k--;
						while(j<k&&nums[k] == nums[k-1]){
							k--;
						}
					}
					else {
						j++;
						while(j<k&&nums[j] == nums[j-1]){
							j++;
						}
					}
					
				}
				//指向下一个要处理的数
				i++;
				//从左向右找到第一个与之前处理的数不同数的书的下标
				while(i<nums.length-2&&nums[i] == nums[i-1]){
					i++;
				}
			}
		}
		return result;
		
	}
 }
