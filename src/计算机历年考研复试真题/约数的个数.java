package ��������꿼�и�������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
 * ��Ŀ����
	����n������,�������ÿ������Լ���ĸ���
	��������:
	����ĵ�һ��ΪN��������ĸ���(N<=1000)
	��������1�а���N������������ÿ�����ķ�ΧΪ(1<=Num<=1000000000)
	��N=0ʱ���������
	�������:
	�����ж����������ݣ�����ÿ���������ݣ�
	���N�У�����ÿһ�ж�Ӧ�����һ������Լ���ĸ�����
	ʾ��1
	����
	
	5
	1 3 4 6 12
	���
	
	1
	2
	3
	4
	6
*/
public class Լ���ĸ��� {
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
