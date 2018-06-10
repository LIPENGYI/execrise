package leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 俩个数组的交集 {
	public static int[] intersection(int[] nums1,int[] nums2){
		Set<Integer> nums = new HashSet<Integer>();
		Set<Integer> result = new HashSet<>();
		for(int i = 0;i<nums2.length;i++){
			nums.add(nums2[i]);//放入时候去掉重复的
		}
		for(int i = 0;i<nums1.length;i++){
			if(nums.contains(nums1[i])){
				result.add(nums1[i]);//放入交集
			}
		}
		int[] res = new int[result.size()];
		int i = 0;
		@SuppressWarnings("rawtypes")
		Iterator iter = result.iterator();
		while(iter.hasNext()){
			res[i++] = (int) iter.next();//集合变数组
		}
		return res;
		
	}
}
