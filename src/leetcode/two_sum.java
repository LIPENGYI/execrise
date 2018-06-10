package leetcode;

import java.util.HashMap;

public class two_sum {
	public int [] twoSum(int[] numbers,int target){
		int[] result = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<numbers.length;++i){
			map.put(new Integer(numbers[i]), new Integer(i));
		}
		for(int i=0;i<numbers.length;++i){
			if(map.containsKey(target-numbers[i])&&map.get(target-numbers[i])!=i)
			{
				result[0] = i+1;
				result[1] = map.get(target-numbers[i]).intValue()+1;
				break;
			}
		}
		return result;
		
	}
}
