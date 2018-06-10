package 剑指Offer;

public class 构建乘机数组 {
	public int[] mutiply(int[] A){
		int length = A.length;
		int[] B = new int[length];
		if(length != 0){
			B[0] = 1 ;
			for(int i=1;i<length;i++)
				B[i] = B[i-1]*A[i-1];
			int temp = 1;
			for(int j = length-2;j>=0;j--){
				temp *=A[j+1];
				B[j]*=temp;
			}
		}
		return B;
	}
}
