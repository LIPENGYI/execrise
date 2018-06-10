package leetcode;

public class longestCommonPrefix {
	public String longestCommonPrefix(String[] strs){
		if(strs==null || strs.length<1)
			return "";
		String result = strs[0];
		for(int i=1;i<strs.length;i++){
			if(!strs[i].startsWith(result)){
				result = result.substring(0, result.length()-1);
				i--;
			}
		}
		return result;		
	}
}
