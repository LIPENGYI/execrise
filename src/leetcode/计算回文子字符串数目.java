package leetcode;

public class ����������ַ�����Ŀ {
	int count = 0;
	public int countSubStrings(String s){
		int i,size = s.length();
		for(i = 0;i<size;i++){
			//����Ϊ����
			extend(s,i,i);
			//����Ϊż��
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
