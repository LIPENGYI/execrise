package leetcode;

public class ispalindrome {
	public boolean isPalindrome(int x){
		if(x<0)
			return false;
		return x == reverse(x);
	}

	public int reverse(int x) {
		// TODO Auto-generated method stub
		int rst =0;
		while(x!=0){
			rst = rst*10+x%10;
			x = x/10;
		}
		return rst;
	}
}
