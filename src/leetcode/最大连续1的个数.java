package leetcode;

public class �������1�ĸ��� {
	public int findMaxConsecutiveOnes(int[] nums){
		int max = 0;
		int cur = 0;
		for(int i =0;i<nums.length;i++){
			if(nums[i]==1){
				cur++;
			}
			else{
				max = Math.max(cur, max);
				cur = 0;
			}
		}
		return Math.max(cur, max);		
	}
}
