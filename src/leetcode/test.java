package leetcode;

public class test {
	public static void main(String args[]){
		int a = 12345;
		byte L1 = (byte)((a&0xff00)>>8);
		byte L = (byte)a;
		byte h = (byte)(a>>8);
		
		System.out.println(h);
		System.out.println(L);
	}
}
