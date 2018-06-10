
public class 求最大子数组之和 {
	public static int maxSubarry(int arr[]){
		int n = arr.length;
		int ThisSum = 0,MaxSum = 0,i,j,k;
		for(i=0;i<n;j++){
			for(j=i;j<n;j++){
				ThisSum  = 0;
				for(k = i;k<j;k++){
					ThisSum +=arr[k];
				if(ThisSum>MaxSum){
					MaxSum=ThisSum;
				}
				}
			}
		}
		return MaxSum;
	}
	public static void main(String[] args){
		int[] array = {1,2,3,4};
		System.out.println(maxSubarry(array));
	}
}
