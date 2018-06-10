package ½£Ö¸Offer;

import java.util.Scanner;

public class ZiFuChuanTiHuan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ss = s.nextLine();
		StringBuffer ss2 = new StringBuffer(ss);
		replaceSpace(ss2);
	}
	public static String replaceSpace(StringBuffer str){
		StringBuilder  ss = new StringBuilder();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				ss.append("%20");
			}
			else{
				ss.append(str.charAt(i));
			}
		}
		String n = ss.toString();
		//System.out.println(n);
		return n;		
	} 

}
