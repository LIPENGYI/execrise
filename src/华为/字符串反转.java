package ��Ϊ;
/*
 * ��Ŀ����
	д��һ�����򣬽���һ���ַ�����Ȼ��������ַ�����ת����ַ��������磺
	��������:
	����N���ַ�
	�������:
	������ַ�����ת����ַ���
	ʾ��1
	����
	
	abcd
	���

	dcba
*/
import java.util.Scanner;

public class �ַ�����ת {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		int length = line.length();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<length;i++){
	       sb.append(line.charAt(length-1-i));
		}
		System.out.println(sb.toString());
	}
}
