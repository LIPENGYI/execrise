package leetcode;

public class �ߵ�������λ {
	public int reverseBits(int n){
		
		String Bits = Integer.toBinaryString(n);
		StringBuilder sb = new StringBuilder(Bits);
		String zero = "00000000000000000000000000000000";
		String end = (sb.reverse().toString()+zero).substring(0, 32);
		int m = Integer.valueOf(end); 
		return m;
		
	}
}
