package leetcode;

public class Ðý×ªÊý×é {
	public void rotate(int[] nums,int k){
		k = k%nums.length;
		if(k==0)
			return;
		int[] buf = new int[k];
		for(int i=0;i<k;i++)
			buf[i] = nums[nums.length-k+i];
		for(int i = nums.length-1;i>=k;i--)
			nums[i] = nums[i-k];
		for(int i = 0;i<k;i++)
			nums[i] = buf[i];
	}
}
