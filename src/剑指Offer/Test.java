package ��ָOffer;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,0,0,5};
		boolean s =  isContinuous(array);
		System.out.println(s);
	}
	 public static boolean isContinuous(int [] numbers) {
	       if(numbers == null)
	            return false;
	        Arrays.sort(numbers);  //������
	        int zero = 0, i = 0;
	        for(; i < numbers.length && numbers[i] == 0; i++){
	            zero ++;  //ͳ��0�ĸ���
	        }
	        int zeroNums = 0;
	        for(int j = 0;j<numbers.length-1;j++){
	        	zeroNums+=numbers[j+1]-numbers[j]-1;
	        }
	        if(zero==zeroNums){
	        	return true;
	        }
	        else {
	        	return false;
	        }       
	   }
}
