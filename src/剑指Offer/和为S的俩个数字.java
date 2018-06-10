package 剑指Offer;

import java.util.*;

/**
 * 题目描述：
	输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，
	输出两个数的乘积最小的。
        输出描述:
         对应每个测试案例，输出两个数，小的先输出。
 * @author Administrator
 *
 */
public class 和为S的俩个数字 {
	public ArrayList<Integer> FindNumbersWithSum(int[] array,int sum){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(array.length<2)
			return res;
		int start = 0,end =1;
		int total = array[start]+array[end];
		boolean isMaxEnd = false;
		while(start<end){
			if(total == sum){
				if(res.isEmpty()){
					res.add(array[start]);
					res.add(array[end]);
				}else{
					int multi = res.get(0)*res.get(1);
					if(multi>(array[start]*array[end])){
						res.clear();
						res.add(array[start]);
						res.add(array[end]);
					}
				}
				start++;
				total = array[start]+array[end];
			}else if(total<sum){
				if(!isMaxEnd){
					end++;
				}
				else
					start++;
				total = array[start]+array[end];
			}else if(total>sum){
				isMaxEnd = true;
				end--;
				total = array[start]+array[end];
			}
		}
		return res;	
	}
}
/*public class 和为S的俩个数字 {
	public ArrayList<Integer> FindNumbersWithSum(int[] array,int sum){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(array.length<2){
			return res;
		}
		int start  = 0,end = array.length-1;
		while(start<end){
			if(array[start]+array[end] == sum){
				res.add(array[start]);
				res.add(array[end]);
				break;
			}
			else if(array[start]+array[end]>sum){
				end--;
			}
			else if(array[start]+array[end]<sum){
				start++;
			}
		}
		return res;
		
	}
}*/

