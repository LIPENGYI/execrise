package 华为;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class 提取不重复的整数 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String numbers = String.valueOf(reader.nextInt());
		int length = numbers.length();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<length;i++){
			set.add(numbers.charAt(length-1-i));
		}
		for(Character a :set){
			System.out.print(a);
		}
	}
}
