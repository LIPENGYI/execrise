package leetcode;

import java.util.Arrays;

/*
 * �������������˻���Ҫ������ֵΪ������Ϊ������
 * �ȿ�������Arrays.sort()�������򣬵õ����ֵ��������ֵΪ��ֵ��
 * �����������е�ֵ��Ϊ��ֵ�����ĳ˻����������λ���ֵĳ˻���������ֵΪ��ֵ��
 * �������п��ܴ��ڸ�ֵ������Ϊ��ֵ�����˻�Ϊ�����λ�ĳ˻��������ڸ�ֵ���������ֵΪ�������ǰ
 * ��λ�ĳ˻���
 * */
public class �����������˻� {
	public int maximumProduct(int[] nums){
		Arrays.sort(nums);
		int len = nums.length;
		if(nums[len-1]<0){
			return nums[len-1]*nums[len-2]*nums[len-3];
		}
		int a = nums[len-1]*nums[len-2]*nums[len-3];
		int b = nums[len-1]*nums[0]*nums[1];
		return a>b? a:b;
		
	}
}
