package leetcode;

import java.util.*;

public class À¨ºÅÉú³É {
	public List<String> generateParentesis(int n){
		List<String> list = new ArrayList<>();
		chuli("",list,n,n);
		return null ;
		
	}
	public static void chuli(String s,List<String> list,int left,int right){
		if(left>right){
			return;
		}
		if(left>0){
			chuli(s+"(",list,left-1,right);
		}
		if(right>0){
			chuli(s+")",list,left,right-1);
		}
		if(left==0&&right==0){
			list.add(s);
			return;
		}
	}
}
