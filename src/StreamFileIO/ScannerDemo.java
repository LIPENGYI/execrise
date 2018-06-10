package StreamFileIO;

import java.util.*;

public class ScannerDemo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		/*System.out.println("输入一行带有空格的字符串，看是否全部输出：（nextLine）");
		if(scan.hasNextLine()){
			System.out.println(scan.nextLine());
		}
		scan.close();*/
		int i =0;
		float f = 0.0f;
		System.out.println("输入整数：");
		if(scan.hasNextInt()){
			i = scan.nextInt();
			System.out.println("整数数据："+i);
		}else{
			System.out.println("输入的不是整数！");
			
		}
		
		System.out.println("输入小数：");
		if(scan.hasNextFloat()){
			f = scan.nextFloat();
			System.out.println("小数数据："+f);
		}else{
			System.out.println("输入的不是小数！");
		}
		scan.close();
	}
}
