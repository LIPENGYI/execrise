package leetcode;

import java.util.Arrays;
/*
 * ��Ŀ��ǩ��Greedy
���������Ŀ������������array��һ�����С���ѵ�θ��ֵ����һ�����������ɵĴ�С������Ҫ�ַ�����������ܶ��С���ѣ�
����������ɵĴ�С�ǿ�������С���ѵ�θ�ڵġ�
�������ǲ��ܰѴ������ȥ�����Сθ�ڵ�С���ѣ�����û��ѡ�񡣾����ܵ�ȥ��С���淢��Сθ�ڵ�С���ѡ����Ȱ�����array �������У�
��С����Ȼ���������array��
�ҵ����������С���ѣ����������棬��ס����index���´ξ�ֱ�Ӵ���һ��С���ѿ�ʼ�ҡ�*/
public class �ַ����� {
	public int findContentChilderen(int[] g,int[] s){
		int res = 0;
		int index_g = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		for(int i = 0;i<s.length;i++){
			if(s[i]>=g[index_g]){
				res++;
				index_g++;
				if(index_g>=g.length){
					break;
				}
			}
		}
		return res;	
	}
}
