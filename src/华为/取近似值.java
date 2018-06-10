package 华为;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 题目描述
	写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
	输入描述:
	输入一个正浮点数值
	输出描述:
	输出该数值的近似整数值
	示例1
	输入	
	5.5
	输出	
	6
 * 
 */
public class 取近似值 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double numbers  = Double.parseDouble(reader.readLine());
		double x =numbers-((double)((int)(numbers)));
		int result=0;
		if(x>=0.5){
			result=(int)(numbers+0.5);
		}else{
			result=(int)(numbers);
		}
		System.out.println(result);
	}

}
