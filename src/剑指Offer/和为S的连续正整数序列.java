package 剑指Offer;

import java.util.ArrayList;

public class 和为S的连续正整数序列 {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		if(sum<=1)
			return lists;
		int small = 1;
		int big  = 2;
		while(small!=(1+sum)/2){
			int curSum = sumOfList(small,big);
			if(curSum == sum){
				ArrayList<Integer>list = new ArrayList<Integer>();
				for(int i = small;i<=big;i++){
					list.add(i);
				}
				lists.add(list);
				small++;big++;
			}
			else if(curSum<sum){
				big++;
			}
			else{
				small++;
			}
		}
		return lists;	
	}
	public int sumOfList(int head,int leap){
		int sum = head;
		for(int i = head+1;i<leap;i++){
			sum+=i;
		}
		return sum;
	}
}
