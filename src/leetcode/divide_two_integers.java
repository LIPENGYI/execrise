package leetcode;
/**
 * divide-two-integers
 * Divide two integers without using multiplication, 
 * division and mod operator.

 * @author Administrator
 *
 */
public class divide_two_integers {
	public int divide(int dividend,int divisor){
		if(dividend ==0 || divisor == 0)
			return 0;
		boolean isNeg = (dividend>0&&divisor<0)||(divisor>0&&dividend<0);
		long a = Math.abs((long)dividend);
		long b = Math.abs((long)divisor);
		if(b>a)
			return 0;
		long sum =0;
		long pow =0;
		int result = 0;
		while(a>=b){
			pow =1;
			sum =b;
			while(sum+sum<=a){
				sum+=sum;
				pow+=pow;
			}
			a-=sum;
			result+=pow;		
		}
		return isNeg? -result : result;
		
	}
}
