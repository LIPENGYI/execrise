package leetcode;

public class ººÃ÷¾àÀë {
	public int hammingDistance(int x,int y){
		int z = x^y;
		int res = 0;
		while(z!=0){
			if(z%2 == 1){
				res++;
			}
			z = z/2;
		}
		return res;
		
	}
}
