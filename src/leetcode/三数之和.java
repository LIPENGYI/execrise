package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ����֮�� {
	public List<List<Integer>> thredSum(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		if(nums!=null&&nums.length>2){
			Arrays.sort(nums);
			//i��ʾ���ȡ��i������Ϊ���
			for(int i=0;i<nums.length-2;){
				//�ڶ��������ܵ���ʼλ��
				int j = i+1;
				//���������ܵĽ���λ��
				int k = nums.length-1;
				while(j<k){
					//����ҵ����������Ľ�
					if(nums[j]+nums[k] == -nums[i]){
						List<Integer> list = new ArrayList<>(3);
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						result.add(list);
						//�ƶ�����һ��λ�á�����һ���
						k--;
						j++;
						//���������ҵ�һ����֮ǰ���������ͬ�������±�
						while(j<k&&nums[j] == nums[j-1]){
							j++;
						}
						//���������ҵ�һ����֮ǰ���������ͬ�������±�־
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
				//ָ����һ��Ҫ�������
				i++;
				//���������ҵ���һ����֮ǰ���������ͬ��������±�
				while(i<nums.length-2&&nums[i] == nums[i-1]){
					i++;
				}
			}
		}
		return result;
		
	}
 }
