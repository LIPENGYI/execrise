package leetcode;
//letter_combinations_of_a_phone_number
import java.util.*;

public class letter_combinations {
	public ArrayList<String> letterCombination(String digits){
		ArrayList<String> res = new ArrayList<String>();
		if(digits == null||digits.length()==0){
			res.add("");
			return res;
		}
		String[] keyboard={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz",};
		dfs(keyboard,digits,0,new StringBuilder(),res);
		return res;		
	}
	private static void dfs(String[] keyboard,String digits,int index,StringBuilder temp,ArrayList<String> res){
		if(index == digits.length()){
			res.add(temp.toString());
			return;
		}
		int num = digits.charAt(index)-'0';
		for(int i=0;i<keyboard[num].length();i++){
			temp.append(keyboard[num].charAt(i));
			dfs(keyboard,digits,index+1,temp,res);
			temp.deleteCharAt(temp.length()-1);
		}
	}
}
