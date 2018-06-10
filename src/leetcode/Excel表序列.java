package leetcode;

public class Excel±íĞòÁĞ {
	public int titleToNumber(String s) {
       int n = s.length();
       int res = 0;
       int tmp = 1;
       for(int i = n-1;i>=0;--i){
    	   res+=(s.charAt(i)-'A'+1)*tmp;
    	   tmp*=26;
       }
	return res;
	}
}
