package leetcode;

public class ��ת�ַ��� {
	public boolean rotateString(String A,String B){
		String C = A+A;
		return A.length()==B.length()&&C.contains(B);		
	}
}
