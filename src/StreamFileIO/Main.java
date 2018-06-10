package StreamFileIO;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入数据：");
		StringTokenizer StringTokenizer = new StringTokenizer(scanner.nextLine());
		System.out.println("分割后为：");
		while(StringTokenizer.hasMoreTokens()){
			System.out.println(StringTokenizer.nextToken());
		}
	}

}
