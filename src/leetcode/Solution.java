package leetcode;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<String>> partition(String s){
		ArrayList<ArrayList<String>> lists = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		partitionHelper(lists,list,s);
		return null;	
	}
	public static void partitionHelper(ArrayList<ArrayList<String>> lists,ArrayList<String> list,String s){
		if(null ==s || s.length()==0){
			lists.add(new ArrayList<>(list));
		}
		int len = s.length();
		for(int i=0;i<=len;i++){
			String subStr =s.substring(0,i);
			if(isPalindrome(subStr)){
				list.add(subStr);
				partitionHelper(lists,list,s.substring(i,len));
				list.remove(list.size()-1);
			}
		}
	}
	public static boolean isPalindrome(String s){
		if(null==s||s.length()==0)
			return false;
		int length = s.length();
		int middle = length/2;
		for(int i=0;i<middle;i++){
			if(s.charAt(i)!=s.charAt(length-1-i)){
				return false;
			}
		}
		return true;
	}
}
