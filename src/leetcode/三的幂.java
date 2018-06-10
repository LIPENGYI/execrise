package leetcode;

public class ÈýµÄÃÝ {
	public boolean isPowerOfThree(int n){
		double tem = Math.log10(n)/Math.log10(3);
		return (tem-(int)(tem)) == 0?true:false;
	}
}
