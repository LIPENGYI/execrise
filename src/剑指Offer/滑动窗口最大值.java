package ��ָOffer;

import java.util.*;

public class �����������ֵ {
	public ArrayList<Integer> maxInWindows(int[] num,int size){
		ArrayList<Integer> array = new ArrayList<Integer>();
		if(size==0)
			return array;
		if(num.length<size){
			return array;
		}
		for(int i = 0;i<num.length-size+1;i++){
			int max = 0;
			for(int j=i;j<i+size;j++){
				if(max<num[j]){
					max = num[j];
				}
			}
			array.add(max);
		}
		return array;
		
	}
}
