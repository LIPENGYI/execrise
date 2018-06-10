package leetcode;

import java.util.*;

public class FourSum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] num,int target){
		ArrayList<ArrayList<Integer>> arrays = new ArrayList();
		if(num ==null || num.length<4)
			return arrays;
		Arrays.sort(num);
		ArrayList<Integer> list = new ArrayList();
		for(int i=0;i<num.length-4;i++){
			if(i>0&&num[i]==num[i-1])
				continue;
			int begin = i+1;
			int threesum = target-num[i];
			for(int j =begin;i<num.length-3;j++){
				if(j>begin&&num[j]==num[j-1]){
					continue;
				
				}
				int left = j+1;
				int right =num.length-1;
				while(left<right){
					int ans = num[j]+num[left]+num[right];
					if(ans == threesum){
						list.add(num[i]);
						list.add(num[j]);
						list.add(num[left]);
						list.add(num[right]);
						arrays.add(list);
						list = new ArrayList();
						left++;
						while(left<right&&num[left]==num[left-1])
							left++;
						right--;
						while(left<right&&num[right]==num[right+1])
							right++;
						
					}else if(ans<threesum)
						left++;
					else
						right++;
				}
			}
		}
		return arrays;		
	}
}
