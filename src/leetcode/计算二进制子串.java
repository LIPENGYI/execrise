package leetcode;
/*
 * 一开始没想到方法除了遍历，看了一下别人这个思路就比较巧妙了。

就是统计连续的0或者1的个数存进一个数组，那么总的组合数就是相邻的个数的最小值的加和。举个例子来说：

比如001101000这个字符串，那么统计数组中的值应该是2,2,1,1,3

那么总的次数就是min（2,2）+min（2,1）+min（1,1）+min（1,3），因为要找的是1和0相等的组合，所以一定在交界处出现，并且个数等于0和1中最小的那个，比如00011那么0的个数右3个，1的个数有2个，那么组合就有01,0011这两个，
因为再多了1的个数就不够用了，所以个数是min（3,2），懂了吧！*/
public class 计算二进制子串 {
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
