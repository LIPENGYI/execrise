package leetcode;
import java.util.*;
public class combinationSum {
	public ArrayList<ArrayList<Integer>> combination(int[] condidates,int target){
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Arrays.sort(condidates);
		combine(condidates,0,target,list1,list2);
		return list1;
		
	}
	public void combine(int[] candidates,int count,int target,
			    ArrayList<ArrayList<Integer>> list1,ArrayList<Integer> list2){
		if(target == 0){
			list1.add(new ArrayList<Integer>(list2));
			return;
		}
		for(int i=count;i<candidates.length;i++){
			if(candidates[i]<= target){
				list2.add(candidates[i]);
				combine(candidates,i,target-candidates[i],list1,list2);
				list2.remove(new Integer(candidates[i]));
			}
		}
	}
}
