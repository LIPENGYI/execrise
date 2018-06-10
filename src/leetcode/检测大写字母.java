package leetcode;

public class ¼ì²â´óĞ´×ÖÄ¸ {
	public boolean detectCapitalUse(String word){
		char c1 = word.charAt(0);
		String temp = word.substring(1,word.length());
		if(betweenChars(c1,'A','Z')&&temp.length()!=0&&
				temp.chars().allMatch(c->betweenChars((char)c,'a','z'))){
					return true;
			
		}
		return word.chars().allMatch(c->betweenChars((char)c,'A','Z'))||
				word.chars().allMatch(c->betweenChars((char)c,'a','z'));		
	}
	public boolean betweenChars(char c, char startChar,char endChar){
		
		return c>=startChar && c<=endChar;
		
	}
}
