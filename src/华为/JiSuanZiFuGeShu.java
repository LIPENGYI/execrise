package »ªÎª;

import java.util.Scanner;

public class JiSuanZiFuGeShu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine().toUpperCase();
		//System.out.println(s);
		Scanner ina = new Scanner(System.in);
		String s1 = in.nextLine().toUpperCase();
		//System.out.println(s1);
		int sum = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == s1.charAt(0)){
				sum++;
			}
			
		}
		System.out.println(sum);	
	}

}
