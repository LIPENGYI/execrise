package leetcode;

public class 计算回文子字符串数目 {
	int count = 0;
	public int countSubStrings(String s){
		int i,size = s.length();
		for(i = 0;i<size;i++){
			//长度为奇数
			extend(s,i,i);
			//长度为偶数
			extend(s,i,i+1);
		}
		return 0;	
	}
	public void extend(String s,int left,int right){
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
			count++;
			left--;
			right++;
		}
	}
}
