package leetcode;

import java.util.*;

public class permutations {
	public ArrayList<ArrayList<Integer>> permute(int[] num){
	ArrayList<ArrayList<Integer>> retList = new ArrayList<ArrayList<Integer>>();
	if(num == null || num.length ==0)
		return retList;
	ArrayList<Integer> list = new ArrayList<Integer>();
	boolean[] visited = new boolean[num.length];
	
	return retList;
	}
	private void dfs(int[] nums,boolean[] visited,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> retList){
		if(list.size() == nums.length){
			retList.add(new ArrayList<Integer>(list));
		}else{
			for(int i=0;i<nums.length;i++){
				if(!visited[i]){
					visited[i] = true;
					list.add(nums[i]);
					dfs(nums,visited,list,retList);
					list.remove(list.size()-1);
					visited[i] =false;
				}
			}
		}
	}
}
