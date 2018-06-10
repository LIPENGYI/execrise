package leetcode;
/*
 * һ��ʼû�뵽�������˱���������һ�±������˼·�ͱȽ������ˡ�

����ͳ��������0����1�ĸ������һ�����飬��ô�ܵ�������������ڵĸ�������Сֵ�ļӺ͡��ٸ�������˵��

����001101000����ַ�������ôͳ�������е�ֵӦ����2,2,1,1,3

��ô�ܵĴ�������min��2,2��+min��2,1��+min��1,1��+min��1,3������ΪҪ�ҵ���1��0��ȵ���ϣ�����һ���ڽ��紦���֣����Ҹ�������0��1����С���Ǹ�������00011��ô0�ĸ�����3����1�ĸ�����2������ô��Ͼ���01,0011��������
��Ϊ�ٶ���1�ĸ����Ͳ������ˣ����Ը�����min��3,2�������˰ɣ�*/
public class ����������Ӵ� {
	public int countBinarySubStrings(String s){
		char[] chars = s.toCharArray();
		int len = chars.length;
		int[] group = new int[len];
		int index = 0;
		group[0] = 1;
		for(int i = 0;i<len-1;i++){
			if(chars[i]!=chars[i+1]){
				group[++index] = 1;
			}else{
				group[index]++;
			}
		}
		int res = 0;
		for(int i = 0;i<index;i++){
			res = res+Math.min(group[i], group[i+1]);
		}
		return res;
		
	}
}
