package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ���ظ��ַ�����Ӵ� {
	/*
	 * ˼·��ѭ�������ַ������ҵ����������������ַ���������Щ�ַ����ĳ��������ҵ���ķ���
	 */
	public int lengthOfLongestSubstring(String s){
		//�շ���0
		if("".equals(s)||s==null){
			return 0;
		}
		//list������ţ�ÿһ���������������ַ����ĳ���
		List list = new ArrayList();
		//list2��һ����ʱ���ϣ��������ÿһ��������ȡ���Ĳ�ͬ�ظ��ַ�
		List list2 = new ArrayList();
		//ÿһ���������������ַ��ĳ���
		int len = 0;
		for(int i=0;i<s.length();i++){
			int v = 0;
			len =0;
			for(int j = i;j<s.length();j++){
				v = s.charAt(j);
				//�����ǰ�ַ��Ѿ�����ȡ�ˣ���������ǰѭ��
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
