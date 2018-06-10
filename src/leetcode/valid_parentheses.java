package leetcode;

public class valid_parentheses {
	public boolean isValid(String s){
		if(s == null || s.length() == 0)
			return true;
		char[] chs =s.toCharArray();
		char[] match = new char[s.length()];
		int index=0;
		for(int i= 0;i<chs.length;++i){
			if(chs[i]=='(')
				match[index++] = ')';
			else if(chs[i] == '[')
				match[index++] = ']';
			else if(chs[i]=='{')
				match[index++]='}';
			else if(index == 0||match[--index]!=chs[i])
				return false;
		}
		return index == 0;
	}
}
