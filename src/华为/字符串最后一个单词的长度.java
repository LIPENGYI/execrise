package 华为;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 字符串最后一个单词的长度 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] a = reader.readLine().split(" ");
		
		int b = a[a.length-1].length();
		System.out.println(b);
		
	}
}
