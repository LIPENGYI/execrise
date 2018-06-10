package leetcode;

import java.util.Arrays;

public class threeSum_Closest {
	public int threeSumClosest(int[] num,int target){
		if(null==num||num.length<3)
			return 0;
		int len = num.length;
		Arrays.sort(num);
		int result = num[0]+num[1]+num[2];
		int error = Math.abs(target-result);
		for(int i=0;i<=len-3;i++){
			int pre = i+1,post = len-1;
			while(pre<post){
				int sum = num[pre]+num[post]+num[i];
				if(sum==target){
					return sum;
				}
				else{
					if(Math.abs(sum-target)<error){
						result = sum;
						error = Math.abs(sum-target);
					}
					if(sum>target)
						post--;
					else
						pre++;
				}
			}
		}
		return result;		
	}
}
