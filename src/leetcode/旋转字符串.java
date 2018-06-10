package leetcode;

public class Ðý×ª×Ö·û´® {
	public boolean rotateString(String A,String B){
		String C = A+A;
		return A.length()==B.length()&&C.contains(B);		
	}
}
