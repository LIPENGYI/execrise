package leetcode;

public class �ĵ��ݴη� {
	public boolean isPowerOfFout(int num){
		if(num<=0)
			return false;
		
		return (num&num-1)==0&&(num&0x55555555) == num;
		
	}
}
