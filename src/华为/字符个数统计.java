package 华为;
/*
 *	题目描述
	编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
	输入描述:
	输入N个字符，字符在ACSII码范围内。
	输出描述:
	输出范围在(0~127)字符的个数。
	示例1
	输入
	
	abc
	输出

	3
 */
import java.util.LinkedHashSet;
import java.util.Scanner;
public class 字符个数统计 {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String rr = reader.nextLine();
		char[] myChar = rr.toCharArray();
		int numbers= 0;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>(); 
		for(int i=0;i<rr.length();i++){
			if((int)(myChar[i])>=0&&(int)(myChar[i])<=127){
				set.add(myChar[i]);
			}
		}
		numbers = set.size();
		System.out.println(numbers);		
	}
}
