package leetcode;

import java.util.concurrent.locks.*;

/*
 * �������ַ���S��T��T��S���Һ���һ���ַ���Ҫ�ҳ������ͬ���ַ�����

�ţ����������ʵ������򣬳���T����Ǹ��ַ��⣬�����������������������˵���ܼ�*/
public class �Ҳ�ͬ {
	public char findTheDifference(String s,String t){
		char tmp = 0x00;
		for(int i = 0;i<s.length();i++){
			tmp = (char)(tmp^t.charAt(i));
		}
		for(int i = 0;i<t.length();i++){
			tmp = (char)(tmp^t.charAt(i));
		}
		return tmp;
		
	}
	public static void main(String args[]){
		ReentrantLock snj = new ReentrantLock();
	}
}
