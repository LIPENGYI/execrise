package leetcode;

public class 四的幂次方 {
	public boolean isPowerOfFout(int num){
		if(num<=0)
			return false;
		
		return (num&num-1)==0&&(num&0x55555555) == num;
		
	}
}
