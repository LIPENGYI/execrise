package leetcode;

public class �滻����ַ��� {
	public int characterReplacement(String s,int k){
		int n = s.length();
		if(n==0)
			return 0;
		int map[];
		map = new int[26]; //����ĸӳ�䵽map�У�key:��ĸ-��A��    value:��ĸ���ַ����г��ֵĴ���
		map[s.charAt(0)-'A']++;//#ͳ���ַ���s�еĵ�һ����ĸ���ִ���
		int most = map[s.charAt(0)-'A'];//#most:��¼�ַ���s�г��ִ���������ĸ����ʼ��Ϊs[0]���ֵĴ���
		int res = 1;//�滻���������
		int left = 0;//#���崰�ڣ�left���������
		for(int right = 1;right<n;right++){ // #right:�����Ҳ�
			map[s.charAt(right)-'A']++;//#ͳ�����ƵĴ��ڶ�Ӧ����ĸ�ĳ��ִ���������map��
			most = Math.max(most, map[s.charAt(right)-'A']); //#�޸�mostֵ���ж�ԭ�д��ڳ��ִ���������ĸ�����½����ڵ���ĸ���ִ����Ƚϣ�mostȡ����Ǹ�
			if(right - left+1>most+k){//#������ڴ��ڳ��ִ���������ĸ���ִ�����k�ĺͣ�����Ҫ�޸Ĵ���
				map[s.charAt(left)-'A']--;//#�Ƴ����ڵ���ĸ���ִ�����һ
				left++;//#�����������
			}else{
				res = Math.max(res, right-left+1);//#���ִ���>��ǰ���ֵres������£����ǲſ��Ƿ�����others <= k������Ÿ���
			}
		}
		return res;		
	}
}
