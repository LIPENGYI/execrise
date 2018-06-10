package 剑指Offer;

public class 二进制1的个数 {
	public int NumberOf1(int n){
		/*int count = 0;
		while(n!=0){
			n=n&(n-1);
			count++;
		}
		return count;*/
		int count=0;
		int flag=1;
		while(flag!=0){
			if((n&flag)!=0){
				count++;
			}
			flag=flag<<1;			
		}
		return count;
	}
}
