package »ªÎª;

import java.util.Scanner;

public class ZuiHouDanCiChangDu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ss=s.nextLine();
		String[] strarray = ss.split(" ");
		int i =strarray.length;
		String s2=strarray[i-1];
		System.out.print(s2.length());
	}

}
