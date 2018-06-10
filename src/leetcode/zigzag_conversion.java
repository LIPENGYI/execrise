package leetcode;
//http://blog.csdn.net/pistolove/article/details/41408021
/**
             ��1��ͨ���ַ�����ÿһ�г��ֵ�˳�򣬿�������������֣���һ�к����һ�У��м��С�
	��2�����ڵ�һ�к����һ�У�����ͼ��֪��������ͬ�Ķ�Ӧ��ϵ��
	��3�������м��У�ǰһ���±��ֵ�ͺ�һ���±��ֵ��Ҫ��������±��Ǹ����е������л���ż���������㡣
	��4�����ѵ�һ�к����һ�У�ͨ�����ɷ��֣����Ӧ��ϵΪ��start + 2 * ������ - 2 ������startΪ������ʼ�ַ��������λ�á������һ�п�ʼ��start = 0���������
	Ӧλ�� Ϊ0 + 2 * 5 - 2 = 8����ʼstartΪ���е���ʼֵ��ͬ���������һ�У���start = 4ʱ���������Ӧλ��Ϊ4+ 2 * 5 - 2 = 12���������ơ�
	��5�������м��У�������Ϊ����ʱ�����Ӧλ�ù�ϵΪ��start + 2 * (������ - ��ǰ�� - 1)��������Ϊż��ʱ�����Ӧ��ϵΪ��start + 2 * ��ǰ�У����е�ǰ�д�0��ʼ 
	�����磬���ڵ����е���ʼstart = 3�������λ��������Ϊ1���������У������λ��Ϊ 3 + 2 * ��5 - 3 -1��= 5 ����ʱstart = 5���������λ����������Ϊ4����ż��
	�У������λ��Ϊ5 + 2 * 3= 11��       
 * @author Administrator
 *
 */
public class zigzag_conversion {
	public static String convert(String s ,int nRows){
		if(nRows<=0)
			return "";
		if(nRows == 1 || nRows>=s.length())
			return s;
		StringBuffer buffer = new StringBuffer();
		int len = s.length();
		for(int i=0;i<len&&i<nRows;++i){
			int start = i;
			buffer.append(s.charAt(start));
			for(int j =1;start<len;++j){
				if(i==0||i==nRows-1){
					start = start+2*nRows-2;
				}else{
					if(j%2==1){
						start = start+2*(nRows-i-1);
					}else{
						start = start+2*i;
					}
				}
				if(start<len)
					buffer.append(s.charAt(start));
			}
		}
		return buffer.toString();
		
	}
}
