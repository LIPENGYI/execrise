package 剑指Offer;

public class 数字在排序数组中出现的次数 {
	public int GetNumberOfK(int[] array,int k){
		int out = 0;
		int len = array.length;
		for(int i = 0;i<len;i++){
			if(array[i]==k)
				out++;
			if(array[i]>k)
				break;
		}
		return out;
		
	}
}
