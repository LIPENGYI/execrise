package leetcode;

import java.util.Arrays;
/*
 * 题目标签：Greedy
　　这道题目给了我们两组array，一组代表小朋友的胃口值，另一组代表曲奇饼干的大小。我们要分发曲奇给尽可能多的小朋友，
并且曲奇饼干的大小是可以满足小朋友的胃口的。
所以我们不能把大的曲奇去满足很小胃口的小朋友，除非没有选择。尽可能的去把小曲奇发给小胃口的小朋友。首先把两个array 重新排列，
从小到大。然后遍历曲奇array，
找到可以满足的小朋友，发给他曲奇，记住他的index，下次就直接从下一个小朋友开始找。*/
public class 分发饼干 {
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
