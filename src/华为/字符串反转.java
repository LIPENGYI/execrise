package 华为;
/*
 * 题目描述
	写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：
	输入描述:
	输入N个字符
	输出描述:
	输出该字符串反转后的字符串
	示例1
	输入
	
	abcd
	输出

	dcba
*/
import java.util.Scanner;

public class 字符串反转 {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		int length = line.length();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<length;i++){
	       sb.append(line.charAt(length-1-i));
		}
		System.out.println(sb.toString());
	}
}
