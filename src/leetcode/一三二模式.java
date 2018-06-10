package leetcode;

public class 一三二模式 {
	public boolean find132pattern(int[] nums){
		if(nums.length<=2)
		{
			return false;
		}
		int n = nums.length,i=0,j=0,k=0;
		while(i<n){
			while(i<n-1&&nums[i]>=nums[i+1])++i;
			j = i+1;
			while(j<n-1&&nums[j]<nums[j+1])++j;
			k=j+1;
			while(k<n){
				if(nums[k]>nums[i]&&nums[k]<nums[j])
					return true;
				++k;
			}
			i = j+1;
		}
		return false;		
	}
}
