package leetcode;

import java.util.HashSet;
import java.util.Set;

public class longest_substring_norepeat {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		
		Set<Character> set = new HashSet<>();
		int anx =0,i =0,j=0;
		while(i<n&&j<n){
			if(!set.contains(s.charAt(j))){
				set.add(s.charAt(j++));
				anx = Math.max(anx, j-i);
			}else{
				set.remove(s.charAt(i++));
			}
		}
		return anx;
        
    }
}
