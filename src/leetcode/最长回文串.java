package leetcode;

import java.util.*;

public class 最长回文串 {
	public int longestPalindrome(String s){
		if(s == null)
			return 0;
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				map.replace(s.charAt(i), map.get(s.charAt(i)+1));
			}
			else{
				map.put(s.charAt(i), 1);
			}
		}
		int result = 0;
		for(Map.Entry<Character, Integer> entry:map.entrySet()){
			if(entry.getValue()%2==0){
				result+=entry.getValue();
			}
			else{
				result+=entry.getValue()-1;
			}
		}
		if(result<s.length())
			result++;
		return result;
		
	}
}
