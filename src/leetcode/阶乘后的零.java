package leetcode;

import ÃæÊÔĞ¡²âÊÔ.B;

public class ½×³ËºóµÄÁã {
	public int trailingZeroes(int n){
		int sum = 0;
		while(n>0){
			sum+=n/5;
			n/=5;
		}
		return sum;		
	}
}
