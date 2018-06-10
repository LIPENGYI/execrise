package leetcode;

public class 种花问题 {
	public boolean canPlaceFlowers(int[] flowerbed,int n){
		for(int i = 0;i<flowerbed.length;i++){
			if(staticfy(flowerbed,i) == true){
				flowerbed[i] = 1;
				n--;
			}
		}
		return n<=0?true:false;	
	}
	public boolean staticfy(int[] nums,int n){
		if(nums[n] == 1){
			return false;
		}
		int len = nums.length - 1;
		if(nums[n] == 0&&(n-1<0||nums[n-1] == 0)&&(n+1>len||nums[n+1]==0)){
			return true;
		}
		else
			
			return false;
		
	}
}
