package leetcode;
/*
 * ��Ŀ��ǩ��Array

������Ŀ��������һ�� nums array�� �����������ҵ� ���������������֣����ܶ���1������Ȼ������Щ�����У��ҵ�һ�� ������С�� ���֡��������ĳ��ȡ�

�����Ƚ�ֱ�ӵ��뷨���ǣ���Ȼ��������Ҫ֪��ÿһ�����ֳ��ֵĴ�������ô������HashMap���������ǻ�Ҫ֪�� ������ֵ���Сindex �����index����ôҲ���Դ���map��¼��

������һ��HashMap<Integer, int[]> map�� key ���� num��value ����int[3]: int[0] ��¼ firstIndex; int[1] ��¼ lastIndex; int[2] ��¼������

���������Ļ���������Ҫ�������Σ�

����������һ�α���nums array����¼ÿһ�����ֵ� firstIndex�� lastIndex�� ���ִ����� ��Ҫ��¼�����ĳ��ִ�����

���������ڶ��α���map key set����key (num) �Ĵ���������������ʱ�򣬼�¼��С�ĳ��ȡ�(lastIndex - firstIndex + 1)��*/

import java.util.HashMap;

public class ����Ķ� {
	public int findShortestSubArray(int[] nums){
		HashMap<Integer,int[]> map = new HashMap<>();
		int maxFre = 0;
		int minLen = Integer.MAX_VALUE;
		for(int i = 0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				map.get(nums[i])[1] = i;//��������
				map.get(nums[i])[2]++;//���µ�ǰ����
			}
			else{
				int[] numsInfo = new int[3];
				numsInfo[0] = i;
				numsInfo[1] = i;
				numsInfo[2] = 1;
				map.put(nums[i],numsInfo);
			}
			maxFre = Math.max(maxFre, map.get(nums[i])[2]);
		}
		for(int num:map.keySet()){
			if(maxFre == map.get(num)[2])
				minLen = Math.min(minLen, map.get(num)[1]-map.get(num)[0]+1);
		}
		return minLen;
		
	}
}
