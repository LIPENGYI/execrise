package leetcode;

import java.util.*;

public class ������ {
	public String[] findWords(String[] words){
		List<String> oneRowWords = new ArrayList<String>();
		String[] keyboard ={"qwertyuiop","asdfghjkl","zxcvbnm"};
		for(String word:words){
			String realWord = word;
			word = word.toLowerCase();//ÿ����ĸ��ΪСд
			char[] strBit = word.toCharArray();
			int count = 0;
			for(char ch:strBit){
				if(keyboard[0].indexOf(strBit[0])!=-1){//��һ����ĸ�ڵ�һ��
					if(keyboard[0].indexOf(ch)==-1)//������ĸ����Ҳ�ڵ�һ��  ��������
						break;
				}
				else if(keyboard[1].indexOf(strBit[0])!=-1){//��һ����ĸ�ڵڶ���
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
