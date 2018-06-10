package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Êý×ÖµÄ²¹Êý {
	public int findComplement(int num){
		List<Integer> bit = new ArrayList<>();
		int res = 0;
		while(num!=0){
			bit.add(num%2);
			num/=2;
		}
		for(int i = 0;i<bit.size();i++){
			if(bit.get(0)==1)
				bit.set(i, 0);
			else
				bit.set(i, 1);
		}
		for(int i = 0;i<bit.size();i++){
			if(bit.get(i) == 1){
				res+=(int)Math.pow(2, i);
			}
		}
		return res;
	}
}
