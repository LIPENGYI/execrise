package 华为;
/*
 * 题目描述
	功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
	最后一个数后面也要有空格
	
	详细描述：
	
	函数接口说明：
	public String getResult(long ulDataInput)
	输入参数：
	long ulDataInput：输入的正整数
	返回值：
	String
	
	
	输入描述:
	输入一个long型整数
	输出描述:
	按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
	示例1
	输入
	
	180
	输出
	
	2 2 3 3 5
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 质数因子 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long numbers =Long.parseLong(reader.readLine());
		StringBuffer b = new StringBuffer();
		for(int i=2;numbers!=1;i++){
			while(numbers%i==0&&numbers!=1){
				System.out.print(i+" ");
				numbers=numbers/i;
			}
		}
	}
}
