package leetcode;

import java.util.*;

public class µ¥´ÊÄ£Ê½ {
	public boolean wordPattern(String pattern,String str){
		Map<String,Integer> nums = new HashMap<>();
		int num = 1;
		String[] strs =str.split("");
		if(strs.length!=pattern.length()){
			return false;
		}
		int[] strnum = new int[strs.length];
		for(int i = 0;i<strs.length;i++){
			if(!nums.containsKey(strs[i]))
			strnum[i] = nums.get(strs[i]);
		}
		num =1;
		int[] letters = new int[26];
		for(int i = 0;i<pattern.length();i++){
			int j = pattern.charAt(i)-'a';
			if(letters[j]==0)
				letters[j] = num++;
		}
		int[] patternnum = new int[pattern.length()];
		for(int i = 0;i<pattern.length();i++){
			patternnum[i] = letters[pattern.charAt(i)-'a'];
		}
		for(int i = 0;i<patternnum.length;i++){
			if(patternnum[i]!=strnum[i]){
				return false;
			}
		}	
		return true;
	}
}
