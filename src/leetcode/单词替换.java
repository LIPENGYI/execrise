package leetcode;

import java.util.*;

public class µ¥´ÊÌæ»» {
	public String replaceWords(List<String> dict,String setence){
		Set<String> set = new HashSet<String>();
		set.addAll(dict);
		String Words[] = setence.split(" ");
		String repalceWords = "";
		for(int i = 0;i<Words.length;i++){
			for(int j = 0;j<Words[i].length();j++){
				//²éÕÒµ¥´ÊµÄËõÐ´
				if(set.contains(Words[i].substring(0, j+1))){
					Words[i] = Words[i].substring(0, j+1);
					break;
				}
			}
		}
		for(int j = 0;j<Words.length;j++){
			repalceWords+=(Words+" ");
		}
		return repalceWords.substring(0,repalceWords.length()-1);
		
	}
}
