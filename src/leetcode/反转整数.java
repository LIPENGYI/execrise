package leetcode;

public class 反转整数 {
	public int reverse(int x){
		long result = 0;
		int tmp = Math.abs(x);
		while(tmp>0){
			result*=10;
			result+=tmp%10;
			if(result>Integer.MAX_VALUE){
				return 0;
			}
			tmp/=10;
		}
		return (int)(x>0?result:-result);
	}
}
