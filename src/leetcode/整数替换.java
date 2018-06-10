package leetcode;

public class ÕûÊıÌæ»» {
	public int integerReplacement(int n){
		if(n == 1)
			return 0;
		if(n%2 == 0)
			return 1+integerReplacement(n/2);
		else {
			long t = n;
			return 2+Math.min(integerReplacement((int)((t + 1) / 2)), integerReplacement((int)((t - 1) / 2)));
		}
	}
}
