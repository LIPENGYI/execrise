package »ªÎª;

import java.util.Scanner;

public class ZhiShuYinZi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long num = s.nextLong();
		getstr(num);
	}
	private static void getstr(long num1){
		for(long i=2;i<=num1;i++){
			while(num1%i==0 && num1!=0){
				System.out.print(" "+i);
				num1 = num1/i;
			}
		}
	}
}
