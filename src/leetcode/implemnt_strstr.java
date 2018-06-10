package leetcode;

public class implemnt_strstr {
	  public String strStr(String haystack, String needle) {
	        String s = haystack;
	        String t = needle;
	        if(s == null||t==null)
				return null;
			if(t.length()==0)
				return s;
			int lenS = s.length();
			int lenT = t.length();
			for(int i=0;i<=lenS-lenT;i++){
				int j = 0;
				for(;j<lenT;j++){
					if(s.charAt(i+j)!=t.charAt(j))
						break;
				}
				if(j == lenT) return s.substring(i);
			}
			return null;
			
	    }
}
