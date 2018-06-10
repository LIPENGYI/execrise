package leetcode;

import java.io.UnsupportedEncodingException;

public class 一二三四五 {
	public static void main(String args[]) throws UnsupportedEncodingException{
		int a = 12345;
		
		String c = Integer.toBinaryString(a);
		int d = 0;
		d = 32 - c.length();
		StringBuilder s =new StringBuilder();
		for(int i =0;i<d;i++){
			s=s.append("0");
		}
		c = s.toString()+c;
		String H = c.substring(0,8);
		byte h = (byte)Integer.parseInt(H);
		String H1 =Integer.valueOf(H,2).toString();
		String L = c.substring(24);
		String L1 =Integer.valueOf(L,2).toString();
		byte l = (byte)Integer.parseInt(L1);
		
		System.out.println(c);
		
			System.out.print(h);
		
		System.out.println();
		
			System.out.print(l);
		
		
	}
	
}
