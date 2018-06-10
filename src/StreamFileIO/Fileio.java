package StreamFileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileio {
	public static void main(String[] args) throws FileNotFoundException{
		int[] arr = new int[10];
		int i = 0;
		Scanner sc = new Scanner(new File("D:\\workspace\\lianxi\\src\\StreamFileIO\\test.txt"));
		while(sc.hasNextLine()){
			arr[i] = sc.nextInt();
			i++;
		}
		sc.close();
		System.out.printf("读取了%d个数字\n",i);
		for(int j = 0;j<i;j++){
			System.out.println(arr[i]);
		}
	}
}
