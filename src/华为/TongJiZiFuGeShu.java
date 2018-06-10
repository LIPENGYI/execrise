package »ªÎª;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TongJiZiFuGeShu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ss = s.nextLine();
		char[] c = ss.toCharArray();
		Set<Character> n = new HashSet<Character>();
		for(int i=0;i<ss.length();i++){
			n.add(c[i]);
		}
		int num = n.size();
		System.out.println(num);
	}	
}
