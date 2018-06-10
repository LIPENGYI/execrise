package 剑指Offer;

public class 连续子数组的最大和 {
	public int FindGreatestSumOfSubArray(int[] array){
		int result= array[0];
		int sum=0;
		for(int i=0;i<array.length;i++){
			if(sum>=0){
				sum+=array[i];
			}
			else{
				sum=array[i];
			}
			if(sum>result){
				result=sum;
			}
		}
		return result;
		
	}
}
