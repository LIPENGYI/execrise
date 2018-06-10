package leetcode;

import java.util.concurrent.locks.*;

/*
 * 有两个字符串S和T，T是S打乱后多加一个字符，要找出这个不同的字符来。

嗯，这个问题其实就是异或，除了T多的那个字符外，都可以在异或中消除，不多说，很简单*/
public class 找不同 {
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
