package leetcode;

import java.util.*;

public class ��ʯ��ʯͷ {
	public int numJewelsInstones(String J,String S){
		int res = 0;
		Set set = new HashSet();
		for(char c:J.toCharArray()){
			set.add(c);
		}
		for(char s:S.toCharArray()){
			if(set.contains(s)){
				res++;
			}
		}
		return res;
		
	}
}
