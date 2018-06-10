package leetcode;

public class 最长回文子串 {
//	public String longestPalindrome(String s){
//		int maxLength = 0;
//		int maxStart = 0;
//		int len = s.length();
//		for(int i=0;i<len;i++){
//			for(int j=0;j<len-i;j++){
//				//挨个判断是否回文
//				if(isParlindrome(s,i,j)&&(i+1)>maxLength){
//					maxLength = i+1;
//					maxStart = j;
//				}
//			}
//		}
//		return s.substring(maxStart,maxStart+maxLength);		
//	}
//	private boolean isParlindrome(String s,int i,int j){
//		int left = j;
//		int right = j+i;
//		while(left<j+i){
//			if(s.charAt(left)!=s.charAt(right)){
//				return false;
//			}
//			left++;
//			right++;
//		}
//		return true;
//		
//	}
	public static String longPalindrome(String s){
		if(s == null || s.length() == 1){
			return s;
		}
		int len = s.length();
		boolean[][] flags= new boolean[1000][1000];
		int start = 0;
		int maxLen = 0;
		for(int i=0;i<len;i++){
			flags[i][i] = true;
			if(i<len-1 && s.charAt(i) == s.charAt(i+1)){
				flags[i][i+1] = true;
				start = i;
				maxLen = 2;
			}
		}
		for(int m=3;m<=len;m++){
			for(int i = 0;i<=len-m;i++){
				int j = i+m-1;
				if(flags[i+1][j-1]&&s.charAt(i)==s.charAt(j)){
					flags[i][j] = true;
					start = i;
					maxLen = m;
				}
			}
		}
	   return s.substring(start,start+maxLen);
	}
}
