package StreamFileIO;

import java.util.*;

public class ScannerDemo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		/*System.out.println("����һ�д��пո���ַ��������Ƿ�ȫ���������nextLine��");
		if(scan.hasNextLine()){
			System.out.println(scan.nextLine());
		}
		scan.close();*/
		int i =0;
		float f = 0.0f;
		System.out.println("����������");
		if(scan.hasNextInt()){
			i = scan.nextInt();
			System.out.println("�������ݣ�"+i);
		}else{
			System.out.println("����Ĳ���������");
			
		}
		
		System.out.println("����С����");
		if(scan.hasNextFloat()){
			f = scan.nextFloat();
			System.out.println("С�����ݣ�"+f);
		}else{
			System.out.println("����Ĳ���С����");
		}
		scan.close();
	}
}
