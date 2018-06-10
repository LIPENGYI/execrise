package leetcode;

public class 最长公共前缀 {
	public String longestCommonPrefix(String[] strs){
		if(strs.length == 0){
			return "";
		}
		if(strs.length == 1){
			return strs[0];
		}
		for(int len = 0;len<strs[0].length();len++){
			for(int i = 1;i<strs.length;i++){
				if(len>=strs[i].length()||strs[i].charAt(len)!=strs[0].charAt(len)){
					return strs[0].substring(0, len);
				}
			}
		}
		return strs[0];
	}
}
