package leetcode;

public class wildcard_matching {
	public boolean isMatch(String str,String pattern){
		int start = -1,matchId = 0,s = 0,p=0;
		while(s<str.length()){
			if(p<pattern.length()&&(pattern.charAt(p)=='?'||str.charAt(s)==pattern.charAt(p))){
				s++;
				p++;
			}
			else if(p<pattern.length()&&pattern.charAt(p)=='*'){
				start = p;
				matchId =s;
				p++;
			}
			else if(start!=-1){
				p = start+1;
				matchId++;
				s = matchId;
			}
			else{
				return false;
			}
		}
		while(p<pattern.length()&&pattern.charAt(p)=='*')
			p++;
		return p == pattern.length();
		
	}
}
