package 华为;
/*
 * 题目描述
	给定n个字符串，请对n个字符串按照字典序排列。
	输入描述:
	输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
	输出描述:
	数据输出n行，输出结果为按照字典序排列的字符串。
	示例1
	输入
	
	9
	cap
	to
	cat
	card
	two
	too
	up
	boat
	boot
	输出
	
	boat
	boot
	cap
	card
	cat
	to
	too
	two
	up
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 字串连接的最大长度 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int numbers = reader.nextInt();
		String[] aa = new String[numbers];
		List<String> XX = new ArrayList<String>();
		for(int i=0;i<numbers;i++){
			if(reader.hasNext()){
				aa[i] = reader.next();
				XX.add(aa[i]);
			}
		}
		Collections.sort(XX);
		for(String a:XX){
			System.out.println(a);
		}
	}
}
