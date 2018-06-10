package leetcode;

public class 翻转字符串里的单词 {
	public String reverseWords(String s){
		if(null == s)
			return null;
		StringBuilder sb = new StringBuilder();
		int pos = s.length()-1;
		for(int i = s.length()-1;i>=0;i--){
			if(s.charAt(i)==' '){
				if(sb.length()>0)
					sb.append("");
				sb.append(s.substring(i+1, pos+1));
			}
			pos = i-1;
		}
		if(0<=pos){
			if(sb.length()>0)sb.append(" ");
			sb.append(s.substring(0,pos+1));
		}
		return sb.toString();
		
	}
}
