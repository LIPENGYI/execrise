package leetcode;

public class ������֮�� {
	public int getSum(int a,int b){
		int result = a^b;
		int carray = (a&b)<<1;
		if(carray!=0){
			return getSum(result,carray);
		}
		return result;
	}
}
