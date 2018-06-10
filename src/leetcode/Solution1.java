package leetcode;

import java.util.*;

public class Solution1 {
	public int firstUniqChar(String s){
		Map<Character,Integer> charMap = new HashMap<>(s.length());
		for(int i = 0;i<s.length();i++){
			if(!charMap.containsKey(s.charAt(i))){
				charMap.put(s.charAt(i), 1);
			}else{
				charMap.put(s.charAt(i), charMap.get(s.charAt(i))+1);
			}
		}
		for(int i = 0;i<s.length();i++){
			if(charMap.get(s.charAt(i)) == 1){
				return i;
			}
		}
		return -1;
		
	}
}
