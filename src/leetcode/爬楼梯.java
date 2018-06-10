package leetcode;

public class 爬楼梯 {
	public int climbStairs(int n){
		int result = 0;
		//只有一阶
		if(n == 1){
			result = 1;
		}
		//只有俩阶
		else if(n == 2){
			result = 2;
		}
		else if(n>2){
			int[] ways = new int[n];
			ways[0] = 1;
			ways[1] = 2;
			for(int i = 2;i<ways.length;i++){
				ways[i] = ways[i-1] + ways[i-2];
			}
			result = ways[ways.length-1];
 		}
		return result;
	}
}
