package 剑指Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 把数组排成最小的数 {
	public String PrintMinNumber(int[] numbers){
		int n;
		String s ="";
		ArrayList<Integer> list = new ArrayList<Integer>();
		n=numbers.length;
		for(int i=0;i<n;i++){
			list.add(numbers[i]);
		}
		Collections.sort(list,new Comparator<Integer>(){

			@Override
			public int compare(Integer str1, Integer str2) {
				// TODO Auto-generated method stub
				String s1 = str1+" "+str2;
				String s2 = str2+" "+str1;
				return s1.compareTo(s2);
			}
			
		});
		
		for(int j:list){
			s+=j;
		}
		return s;
		
	}
}
