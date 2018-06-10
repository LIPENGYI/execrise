package »ªÎª;

import java.util.Scanner;

//import java.util.Scanner;

public class xi {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		while(s.hasNextLine()){
			String s1 = s.nextLine();
			get(s1);
		}
	}
	public static void get(String s){
		while(s.length()>=8){
			System.out.println(s.substring(0, 8));
			s = s.substring(8);
		}
		if(s.length()>0&&s.length()<8){
			s = (s+"00000000").substring(0, 8);
			System.out.println(s);
		}
	}
}