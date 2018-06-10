package leetcode;

public class ·Çµİ¼õÊıÁĞ {
	 public boolean checkPossibility(int[] nums) {
		 int i = 0,j = nums.length-1;
		 while(i<j&&nums[i]<=nums[i+1])
			 i++;
		 while(i<j&&nums[j]>=nums[j-1])
			 j--;
		 int head = 0;
		 if(i == 0)
			 head = Integer.MAX_VALUE;
		 else
			 head = nums[i-1];
		 int next = (j==nums.length-1)?Integer.MAX_VALUE:nums[j+1];
		 if(j-i<=1&&head<=nums[j]||nums[i]>next){
			 return true;
		 }
		 else
			 return false; 
	  }
}
