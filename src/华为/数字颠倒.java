package 华为;
/*
 * 	题目描述
	描述：
	输入一个整数，将这个整数以字符串的形式逆序输出
	程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
	 
	输入描述:
	输入一个int整数
	输出描述:
	将这个整数以字符串的形式逆序输出
	示例1
	输入
	
	1516000
	输出

    0006151
*/
import java.util.Scanner;

public class 数字颠倒 {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		int numbers = reader.nextInt();
		String XX = String.valueOf(numbers);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<XX.length();i++){
			sb.append(XX.charAt(XX.length()-1-i));
		}
		System.out.println(sb.toString());
	}
}
