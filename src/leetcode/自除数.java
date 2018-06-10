package leetcode;

import java.util.*;

public class ×Ô³ýÊý {
	public static List<Integer> selfDividingNumbers(int left,int right){
		if(left>right|| left<=0||right>10000){
			return null;
		}
		List<Integer> resultList = new ArrayList<Integer>();
		boolean flag = true;
		int temp = 0;
		int value = 0;
		fora: for(int i=left;i<=right;i++){
			if(i%10==0){
				continue fora;
			}
			if(i<=9){
				resultList.add(i);
				continue fora;
			}
			value = i;
			while(flag){
				temp = value%10;
				if(temp == 0){
					continue fora;
				}
				if(i%temp!=0){
					continue fora;
				}
				temp = value/10;
				if(temp<10){
					if(i%temp!=0){
						continue fora;
					}
					resultList.add(i);
					continue fora;
				}
				value = temp;
			}
		}
		return resultList;		
	}
}
