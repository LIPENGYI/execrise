package leetcode;
/*求解思路
 * ab = a * 10 + b 
ab % 9 = (a*9 + a + b) % 9 = (a + b) % 9 
abc = a * 100 + b * 10 + c 
abc % 9 = ( a*99 + a + b + c) % 9 = (a + b + c) % 9
 * */
public class 各位相加 {
	public int addDigits(int n){
		if(n == 0){
			return 0;
		}
		return (n-1)%9+1;
	}
}
