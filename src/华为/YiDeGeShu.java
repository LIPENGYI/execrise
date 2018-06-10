package »ªÎª;

import java.util.Scanner;

public class YiDeGeShu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Integer NUM = new Integer(num);
		
	    String ss = NUM.toBinaryString(num);
		char[] c = ss.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++){
			if(c[i]=='1')
			sum++;
		}
		System.out.println(sum);
	}
}
