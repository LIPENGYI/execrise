package 剑指Offer;

import java.util.HashMap;

public class 数组中只出现一次的数字 {
	public void FindNumsApperOnce(int[] array,int num1[],int num2[]){
		if(array.length<2)
			return ;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<array.length;i++){
			Integer key = array[i];
			Integer value = map.get(key);
			if(value == null){
				map.put(key, 1);
			}
			else{
				map.put(key, value+1);
			}
		}
		int index = 0;
		for(int i=0;i<array.length;i++){
			if(map.get(array[i])==1&&index == 0){
				num1[index] = array[i];
				index++;
			}
			else if(map.get(array[i])==1&&index == 1){
				num2[index-1] =array[i];
				break;
			}
		}
	}
}
