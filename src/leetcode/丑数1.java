package leetcode;

import java.util.TreeMap;

public class ³óÊı1 {
	public boolean isUgly(int num){
		TreeMap<String,Integer> treeMap = new TreeMap<>(); 
		if(num<=0)
			return false;
		while(num%2 == 0)
			num = num/2;
		while(num%3 == 0){
			num = num/3;
		}
		while(num%5 == 0){
			num = num/5;
		}
		if(num == 1){
			return true;
		}
		else
			return false;
	}
}
