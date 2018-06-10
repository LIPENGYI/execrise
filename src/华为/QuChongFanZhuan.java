package »ªÎª;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class QuChongFanZhuan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		char[] c = s1.toCharArray();
		char[] c2 ;
		int[] num = new int[c.length];
		LinkedHashSet<Character> ch = new LinkedHashSet<Character>();
		for(int i = c.length;i>=1;i--){
			ch.add(c[i-1]);
		}
		for(Character cc : ch){
			System.out.print(cc);
		}
	} 
}
