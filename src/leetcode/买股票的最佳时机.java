package leetcode;
/*
 * ˼·
	����������Ʊ�����ԣ����Ǳ����ȵͼ����ٸ߼�����������������Ĺ���ʵ�������ҵ�ĿǰΪ֮����ͼۡ�
	�ڱ����۸�����ʱ�����������̬���µ���ͼۺ͵�ǰ�ļ۸���������ǰ����Ʊ�����׬����Ǯ��

����
*/
public class ���Ʊ�����ʱ�� {
	public int maxProfit(int[] prices){
		int min = Integer.MAX_VALUE,res = 0;
		for(int i = 0;i<prices.length;i++){
			if(prices[i]<min){
				min = prices[i];
			}
			if((prices[i]-min>res)){
				res  = prices[i] - min;
			}
		}
		return res;
		
	}
}
