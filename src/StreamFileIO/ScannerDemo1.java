package StreamFileIO;

import java.util.*;

public class ScannerDemo1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		while(scan.hasNextDouble()){
			double x = scan.nextDouble();
			m+=1;
			sum+=x;
		}
		System.out.println(m+"�����ĺ�Ϊ��"+sum);
		System.out.println(m+"������ƽ������"+(sum/m));
	}
}
