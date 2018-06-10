package leetcode;
/*
 * 思路
数学解法
1 = 1
4 = 1 + 3
9 = 1 + 3 + 5
16 = 1 + 3 + 5 + 7
25 = 1 + 3 + 5 + 7 + 9
36 = 1 + 3 + 5 + 7 + 9 + 11
....
1+3+...+(2n-1) = (2n-1 + 1)m/2 = mn （其中m为项数 ）*/
public class 有效的完全平方数 {
	public boolean isPerfectSquare(int num){
		int i = 1;
		while(num>0){
			num-=i;
			i+=2;
		}
		return num == 0;
		
	}
}
