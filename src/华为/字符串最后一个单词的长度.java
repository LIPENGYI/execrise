package ��Ϊ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class �ַ������һ�����ʵĳ��� {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] a = reader.readLine().split(" ");
		
		int b = a[a.length-1].length();
		System.out.println(b);
		
	}
}
