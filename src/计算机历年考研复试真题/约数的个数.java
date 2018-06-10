package 计算机历年考研复试真题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
 * 题目描述
	输入n个整数,依次输出每个数的约数的个数
	输入描述:
	输入的第一行为N，即数组的个数(N<=1000)
	接下来的1行包括N个整数，其中每个数的范围为(1<=Num<=1000000000)
	当N=0时输入结束。
	输出描述:
	可能有多组输入数据，对于每组输入数据，
	输出N行，其中每一行对应上面的一个数的约数的个数。
	示例1
	输入
	
	5
	1 3 4 6 12
	输出
	
	1
	2
	3
	4
	6
*/
public class 约数的个数 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numbers = Integer.parseInt(reader.readLine());
		String a[] = reader.readLine().split(" ");
		int b[] = new int[numbers];
		for(int i=0;i<numbers;i++){
			b[i] = Integer.parseInt(a[i]);
		}
		int c[] = new int[numbers];
		for(int j=0;j<numbers;j++){
			for(int k=0;k<=b[j];k++){
				if(b[j]%(k+1)==0){
					c[j]++;
				}
			}
		}
		for(int p=0;p<numbers;p++){
			System.out.println(c[p]);
		}
	}
}
