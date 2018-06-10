package leetcode;

import java.util.*;
/*
 * ����һ���ַ��� s���� s �ָ��һЩ�Ӵ���ʹÿ���Ӵ����ǻ��Ĵ���

	���� s ���п��ܵķָ����
	
	ʾ��:
	
	����: "aab"
	���:
	[
	  ["aa","b"],
	  ["a","a","b"]
	]
*/
//��˷����� ��һ�������¼�ָ��λ�ã�ÿһ�ζ���Ѱ����һ�����Էָ��λ��
public class �ָ��ַ��� {
	List R = new ArrayList<ArrayList<String>>();
	public List<List<String>> partition(String s){
		boolean mark[] = new boolean[s.length()];
		fun(s,0,mark);
		return R;
		
	}
	public void fun(String str, int index, boolean[] mark) {
		// TODO Auto-generated method stub
		if(index>=str.length()){
			List<String> L = new ArrayList<String>();
			int beg = 0,last = 0;
			while(last<str.length()){
				if(mark[last] == true){
					L.add(str.substring(beg,last+1));
					beg = last+1;
				}
				++last;
			}
			R.add(L);
		}
		for(int i = index;i<str.length();++i){
			if(isOK(str,index,i)){
				mark[i] = true;
				fun(str,i+1,mark);
				mark[i] = false;
			}
		}
	}
	public boolean isOK(String str, int beg, int last) {
		// TODO Auto-generated method stub
		while(beg<last&&str.charAt(beg)==str.charAt(last)){
			++beg;
			--last;
		}
		if(beg<last){
			return false;
		}
		else{
		return true;
		}
	}
}
