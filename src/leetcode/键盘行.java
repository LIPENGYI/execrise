package leetcode;

import java.util.*;

public class 键盘行 {
	public String[] findWords(String[] words){
		List<String> oneRowWords = new ArrayList<String>();
		String[] keyboard ={"qwertyuiop","asdfghjkl","zxcvbnm"};
		for(String word:words){
			String realWord = word;
			word = word.toLowerCase();//每个字母变为小写
			char[] strBit = word.toCharArray();
			int count = 0;
			for(char ch:strBit){
				if(keyboard[0].indexOf(strBit[0])!=-1){//第一个字母在第一排
					if(keyboard[0].indexOf(ch)==-1)//其他字母必须也在第一排  否则跳过
						break;
				}
				else if(keyboard[1].indexOf(strBit[0])!=-1){//第一个字母在第二排
					if(keyboard[1].indexOf(ch)==-1){
						break;
					}
				}
				else if(keyboard[2].indexOf(strBit[0])!=-1){
					if(keyboard[2].indexOf(ch)==-1)
						break;
				}
				count++;				
			}
			if(count == strBit.length){
				oneRowWords.add(realWord);
			}
		}
		String[] oneRowWordsArray = new String[oneRowWords.size()];
		for(int i=0;i<oneRowWords.size();i++){
			oneRowWordsArray[i] = oneRowWords.get(i);
		}
		return oneRowWordsArray;		
	}
}
