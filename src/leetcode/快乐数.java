package leetcode;

public class ¿ìÀÖÊı {
	public int getsum(int x){
		int sum = 0;
		while(x!=0){
			sum+=(x%10)*(x%10);
			x = x/10;
		}
			return sum;	
	}
	public boolean isHappy(int n){
		if(n<0)
			return false;
		while(n!=1){
			n= getsum(n);
			if(n==4)
				return false;
		}
		return true;
	}
}
