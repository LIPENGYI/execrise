package leetcode;
import java.util.*;
public class combinationSum2 {
	public ArrayList<ArrayList<Integer>> combinationSum2(int[] num,int target){
		Arrays.sort(num);
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		backTracing(res,new ArrayList<Integer>(),target,0,num);
		return null;
		
	}
	public void backTracing(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list,
			                int target,int index,int[] nums){
		if(target == 0){
			ArrayList<Integer> temp = new ArrayList<>(list);
			res.add(temp);
			return;
		}
		for(int i = index;i<nums.length;i++){
			if(target>=nums[i]){
				list.add(nums[i]);
				backTracing(res,list,target-nums[i],i+1,nums);
				list.remove(list.size()-1);
			}
			while(i<nums.length-1&&nums[i]==nums[i+1]){
				i++;
			}
		}
	}
}
