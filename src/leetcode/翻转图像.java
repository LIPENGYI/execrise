package leetcode;

public class ·­×ªÍ¼Ïñ {
	public int[][] flipAndInvertImage(int[][] A){
		int rows = A.length;
		int cows = A[0].length;
		int temp = 0;
		for(int i = 0;i<rows;i++){
			for(int j = 0;j<cows/2;j++){
				temp = A[i][j];
				A[i][j] = A[i][cows-j-1];
				A[i][cows-j-1] = temp;
			}
		}
		for(int i= 0 ;i<rows;i++){
			for(int j = 0;j<cows;j++){
				A[i][j] = A[i][j]^1;
			}
		}
		return A;
	
	}
	
	
}
