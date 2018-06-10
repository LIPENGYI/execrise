package leetcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Î¨Ò»µÄ¸£¶ûÄ¦Ë¹ÃÜÂë {
	static HashMap<Character,String> map = new HashMap<>();
	static{
		String[] values = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		for(int i = 0;i<values.length;i++){
			map.put((char)('a'+i), values[i]);
		}
	}
	public String uniqueMorse(String str){
		String res = "";
		for(int i = 0;i<str.length();i++){
			res = res + map.get(str.charAt(i));
		}
		return res;	
	}
	public int uniqueMorseRepresentations(String[] words){
		List<String> res = new ArrayList<>();
		for(String word:words){
			res.add(uniqueMorse(word));
		}
	//return res.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).size();	
		return res.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).size();
	}
}
