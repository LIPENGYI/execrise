package leetcode;
/**
 * Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, and there exists 
 * one unique longest palindromic substring.
 * @author Administrator
 *
 */
public class long_palindromic_substring {
	int maxLen =0;
	int resLeft = -1;
	public String longestPalindrome(String s){
		if(s==null||s.length()<2)
			return s;
		char []ch = s.toCharArray();
		for(int i=0;i<s.length()-1;i++){
			isPalindrome(ch,i,i);
			isPalindrome(ch,i,i+1);
		}
		
		return s.substring(resLeft,resLeft+maxLen);	
	}
	public void isPalindrome(char [] ch,int left,int right){
		while(left>=0&&right<ch.length&&ch[left]==ch[right]){
			left--;
			right++;
		}
		if(right-left-1>maxLen){
			maxLen = right-left-1;
			resLeft = left+1;
		}
	}
}
