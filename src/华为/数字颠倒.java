package ��Ϊ;
/*
 * 	��Ŀ����
	������
	����һ��������������������ַ�������ʽ�������
	���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
	 
	��������:
	����һ��int����
	�������:
	������������ַ�������ʽ�������
	ʾ��1
	����
	
	1516000
	���

    0006151
*/
import java.util.Scanner;

public class ���ֵߵ� {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		int numbers = reader.nextInt();
		String XX = String.valueOf(numbers);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<XX.length();i++){
			sb.append(XX.charAt(XX.length()-1-i));
		}
		System.out.println(sb.toString());
	}
}
