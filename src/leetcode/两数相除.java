package leetcode;

public class БЅКэПаіэ {
	public int divide(int dividend,int divisor){
		@SuppressWarnings("unused")
		long result = divideLong(dividend,divisor);
		return divisor;
		
	}
	public long divideLong(long dividend, long divisor) {
		// TODO Auto-generated method stub
		boolean negative = dividend<0!=divisor<0;
		if(dividend<0)
			dividend = -dividend;
		if(divisor<0)
			dividend = -divisor;
		if(dividend<divisor)
			return 0;
		long sum = divisor;
		long divide = 1;
		while((sum+sum)<=dividend){
			sum+=sum;
			divide+=divide;
		}
		return  negative ? -(divide + divideLong((dividend-sum), divisor)):(divide + divideLong((dividend-sum), divisor));
	}
}
