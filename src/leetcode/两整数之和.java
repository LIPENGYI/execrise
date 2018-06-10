package leetcode;

public class 两整数之和 {
	public int getSum(int a,int b){
		int result = a^b;
		int carray = (a&b)<<1;
		if(carray!=0){
			return getSum(result,carray);
		}
		return result;
	}
}
