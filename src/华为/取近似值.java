package ��Ϊ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * ��Ŀ����
	д��һ�����򣬽���һ����������ֵ���������ֵ�Ľ�������ֵ�����С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ����
	��������:
	����һ����������ֵ
	�������:
	�������ֵ�Ľ�������ֵ
	ʾ��1
	����	
	5.5
	���	
	6
 * 
 */
public class ȡ����ֵ {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double numbers  = Double.parseDouble(reader.readLine());
		double x =numbers-((double)((int)(numbers)));
		int result=0;
		if(x>=0.5){
			result=(int)(numbers+0.5);
		}else{
			result=(int)(numbers);
		}
		System.out.println(result);
	}

}
