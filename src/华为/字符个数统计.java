package ��Ϊ;
/*
 *	��Ŀ����
	��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
	��������:
	����N���ַ����ַ���ACSII�뷶Χ�ڡ�
	�������:
	�����Χ��(0~127)�ַ��ĸ�����
	ʾ��1
	����
	
	abc
	���

	3
 */
import java.util.LinkedHashSet;
import java.util.Scanner;
public class �ַ�����ͳ�� {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String rr = reader.nextLine();
		char[] myChar = rr.toCharArray();
		int numbers= 0;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>(); 
		for(int i=0;i<rr.length();i++){
			if((int)(myChar[i])>=0&&(int)(myChar[i])<=127){
				set.add(myChar[i]);
			}
		}
		numbers = set.size();
		System.out.println(numbers);		
	}
}
