package leetcode;
/*���˼·
 * ab = a * 10 + b 
ab % 9 = (a*9 + a + b) % 9 = (a + b) % 9 
abc = a * 100 + b * 10 + c 
abc % 9 = ( a*99 + a + b + c) % 9 = (a + b + c) % 9
 * */
public class ��λ��� {
	public int addDigits(int n){
		if(n == 0){
			return 0;
		}
		return (n-1)%9+1;
	}
}
