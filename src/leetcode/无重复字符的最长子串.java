package leetcode;

import java.util.ArrayList;
import java.util.List;

public class 无重复字符的最长子串 {
	/*
	 * 思路：循环遍历字符串，找到所有满足条件的字符串，将这些字符串的长度排序，找到最长的返回
	 */
	public int lengthOfLongestSubstring(String s){
		//空返回0
		if("".equals(s)||s==null){
			return 0;
		}
		//list用来存放，每一个满足条件的自字符串的长度
		List list = new ArrayList();
		//list2是一个临时集合，用来存放每一个遍历获取到的不同重复字符
		List list2 = new ArrayList();
		//每一个满足条件的子字符的长度
		int len = 0;
		for(int i=0;i<s.length();i++){
			int v = 0;
			len =0;
			for(int j = i;j<s.length();j++){
				v = s.charAt(j);
				//如果当前字符已经被获取了，则跳出当前循环
				if(list2.contains(v)){
					break;
				}else{
					list2.add(v);
					len++;
					continue;
				}
			}
			list.add(len);
			list2.clear();
		}
		int[] arr = new int[list.size()];
		for(int k = 0;k<arr.length;k++){
			arr[k] = Integer.valueOf(String.valueOf(list.get(k)));
		}
		
		return 0;	
	}
	public static int[] sort(int[]a,int head,int tail){
		int mid = (head+tail)/2;
		if(head<tail){
			sort(a,head,mid);
			sort(a,mid+1,tail);
			merge(a,head,mid,tail);
		}
		return a;
		
	}
    public static  void merge(int[] a,int head,int mid, int tail){
    	int[] temp = new int[tail-head+1];
    	int i = head;
    	int j = mid+1;
    	int k  =0;
    	while(i<=mid&&j<=tail){
    		if(a[i]<a[j]){
    			temp[k++] = a[i++];
    		}else{
    			temp[k++] = a[j++];
    		}
    	}
    	while(i<=mid){
    		temp[k++] = a[i++];
    	}
    	while(j<=tail){
    		temp[k++] = a[j++];
    	}
    	for(int x = 0;x<temp.length;x++){
    		a[x+head] = temp[x];
    	}
    }
}
