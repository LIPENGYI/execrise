package ��ָOffer;

import java.util.*;

/**
 * ��Ŀ������
	����һ����������������һ������S���������в������������ǵ����ǵĺ�������S������ж�����ֵĺ͵���S��
	����������ĳ˻���С�ġ�
        �������:
         ��Ӧÿ�����԰����������������С���������
 * @author Administrator
 *
 */
public class ��ΪS���������� {
	public ArrayList<Integer> FindNumbersWithSum(int[] array,int sum){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(array.length<2)
			return res;
		int start = 0,end =1;
		int total = array[start]+array[end];
		boolean isMaxEnd = false;
		while(start<end){
			if(total == sum){
				if(res.isEmpty()){
					res.add(array[start]);
					res.add(array[end]);
				}else{
					int multi = res.get(0)*res.get(1);
					if(multi>(array[start]*array[end])){
						res.clear();
						res.add(array[start]);
						res.add(array[end]);
					}
				}
				start++;
				total = array[start]+array[end];
			}else if(total<sum){
				if(!isMaxEnd){
					end++;
				}
				else
					start++;
				total = array[start]+array[end];
			}else if(total>sum){
				isMaxEnd = true;
				end--;
				total = array[start]+array[end];
			}
		}
		return res;	
	}
}
/*public class ��ΪS���������� {
	public ArrayList<Integer> FindNumbersWithSum(int[] array,int sum){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(array.length<2){
			return res;
		}
		int start  = 0,end = array.length-1;
		while(start<end){
			if(array[start]+array[end] == sum){
				res.add(array[start]);
				res.add(array[end]);
				break;
			}
			else if(array[start]+array[end]>sum){
				end--;
			}
			else if(array[start]+array[end]<sum){
				start++;
			}
		}
		return res;
		
	}
}*/

