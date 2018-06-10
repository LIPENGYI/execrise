package leetcode;

import java.util.ArrayList;
import java.util.List;

public class 电话号码的字母组合 {
	//定义每个数字对应的字符
	static String[] a = new String[]{"","","abc","def",  
            "ghi","jkl","mno","pqrs","tuv","wxyz"};
	static StringBuffer sb = new StringBuffer();
	public static List<String> letterCombinations(String digits){
		if(digits.length()==0){
			return new ArrayList<String>();
		}
		List<String> answer = new ArrayList<String>();
		//开始回朔
		zuhe(digits,0,answer);
		return null;
		
	}
	private static void zuhe(String digits, int n, List<String> answer) {
		// TODO Auto-generated method stub
		if(n == digits.length()){
			answer.add(sb.toString());
		}
		for(int i = 0;i<a[digits.charAt(n)-'0'].length();i++){
			sb.append(a[digits.charAt(n)-'0'].charAt(i));
			zuhe(digits,n+1,answer);
			sb.deleteCharAt(sb.length()-1);
		}
	}
}
