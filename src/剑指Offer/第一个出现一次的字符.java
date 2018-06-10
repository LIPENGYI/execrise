package 剑指Offer;

import java.util.LinkedHashMap;

public class 第一个出现一次的字符{
	public int FirstNotRepeatingChar(String str){
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				int time = map.get(str.charAt(i));
				map.put(str.charAt(i), ++time);
			}
			else{
				map.put(str.charAt(i), 1);
			}
		}
		int pos =-1;
		int i = 0;
		for(;i<str.length();i++){
			char c = str.charAt(i);
			if(map.get(c)==1){
				return i;
			}
		}
		return pos;
		
	}
}
/*public class 第一个出现一次的字符 {
	public int FirstNotRepeating(String str){
		char[] c = str.toCharArray();
		int[] a = new int['z'+1];
		for(char d:c){
			a[(int)d]++;
		}
		for(int i = 0;i<c.length;i++){
			if(a[(int)c[i]]==1)
				return i;
		}
		return -1;
		
	}
}*/

