package ��Ϊ;
/*
 * ��Ŀ����
	����һ��int�͵����������������int���������ڴ��д洢ʱ1�ĸ�����
	��������:
	 ����һ��������int���ͣ�
	�������:
	 �����ת����2���ƺ����1�ĸ���
	ʾ��1
	����
	
	5
	���
	
	2
*/
import java.util.Scanner;

public class ��int�����������ڴ��д洢ʱ1�ĸ��� {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		String two = Integer.toBinaryString(number);
		char[] chartwo = two.toCharArray();
		int sum = 0;
		for(int i=0;i<two.length();i++){
			if('1'==chartwo[i]){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
