package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ´æÔÚÖØ¸´ÔªËØ2 {
	public boolean containsNearbyDuplicate(int[] nums,int k){
		Map<Integer,List<Integer>> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				List<Integer> temp = map.get(nums[i]);
				for(int j = 0;j<temp.size();j++){
					if(i-temp.get(j)<=k&&i-temp.get(j) != 0){
						return true;
					}
					else{
						List<Integer> tempp = new ArrayList<>(temp);
						tempp.add(i);
						map.put(nums[i], tempp);
					}
				}
			}else{
				List<Integer> temp = new ArrayList<>();
				temp.add(i);
				map.put(nums[i], temp);
			}
		}
		return false;
		
	}
}
