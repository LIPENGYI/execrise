package 华为;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 计算字符个数 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String line = reader.readLine().toLowerCase();
		char b = reader.readLine().toLowerCase().toCharArray()[0];
		int numbers=0;
		for(int i=0;i<line.length();i++){
			if(line.charAt(i)==b){
				numbers++;
			}
		}
		System.out.println(numbers);
	}
}
