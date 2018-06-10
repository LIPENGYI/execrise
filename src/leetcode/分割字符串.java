package leetcode;

import java.util.*;
/*
 * 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。

	返回 s 所有可能的分割方案。
	
	示例:
	
	输入: "aab"
	输出:
	[
	  ["aa","b"],
	  ["a","a","b"]
	]
*/
//回朔法解决 用一个数组记录分割的位置，每一次都是寻找下一个可以分割的位置
public class 分割字符串 {
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
