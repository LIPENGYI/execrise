package leetcode;
/*����һ���ǿյ��ַ������ж����Ƿ����������һ���Ӵ��ظ���ι��ɡ��������ַ���ֻ����СдӢ����ĸ�����ҳ��Ȳ�����10000��

	ʾ�� 1:
	
	����: "abab"
	
	���: True
	
	����: �������ַ��� "ab" �ظ����ι��ɡ�
	ʾ�� 2:
	
	����: "aba"
	
	���: False
	ʾ�� 3:
	
	����: "abcabcabcabc"
	
	���: True
	
	����: �������ַ��� "abc" �ظ��Ĵι��ɡ� (�������ַ��� "abcabc" �ظ����ι��ɡ�)
*/
public class �ظ������ַ��� {
	public boolean repeatedSubstringPattern(String s){
		char[] chars = s.toCharArray();
		char first = chars[0];
		String subStr = "";
		for(int i = 1;i<chars.length;i++){
			if(chars[i] == first){
				subStr = s.substring(0,i);
				if(judgeRep(s,subStr))
					return true;
			}
		}
		return false;	
	}

	public boolean judgeRep(String s, String subStr) {
		// TODO Auto-generated method stub
		if(s.length()%subStr.length()!=0){
			return false;
		}
		int group = s.length()/subStr.length();
		String rep ="";
		for(int j = 0;j<group;j++){
			rep+=subStr;
		}
		if(rep.equals(s))
			return true;
		else
			return false;
	}
}
