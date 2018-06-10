package »ªÎª;

import java.util.Scanner;

public class zifuchuanfanzhuan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.nextLine();
		//System.out.println(s1);
		char[] c = s1.toCharArray();
		int l = s1.length();
		char [] o = new char[l];
		for(int i=0;i<l;i++){
			o[i] =c[l-i-1];
		}
		System.out.println(String.valueOf(o));
	}

}
