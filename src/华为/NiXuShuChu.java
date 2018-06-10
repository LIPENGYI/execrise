package »ªÎª;

import java.util.Scanner;

public class NiXuShuChu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ls = s.nextInt();
		String ss = String.valueOf(ls);
		char[] c = ss.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i =ss.length() ;i>=1;i--){
			sb.append(c[i-1]);
		}
		System.out.println(sb.toString());
	}
}
