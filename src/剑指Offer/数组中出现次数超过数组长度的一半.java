package 剑指Offer;

import java.util.Arrays;

public class 数组中出现次数超过数组长度的一半 {
	public int MoreThanHalfNum_Solution(int[] array){
		int len = array.length;
		if(len<1){
			return 0;
		}
		int count = 0;
		Arrays.sort(array);
		int num = array[len/2];
		for(int i= 0;i<len;i++){
			if(num==array[i])
				count++;
		}
		if(count<=(len/2)){
			num= 0;
		}
		return num;		
	}
}
