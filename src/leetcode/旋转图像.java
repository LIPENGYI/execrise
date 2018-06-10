package leetcode;
/*
 * 还有一种解法，首先以从对角线为轴翻转，然后再以x轴中线上下翻转即可得到结果，如下图所示(其中蓝色数字表示翻转轴)：

1  2  3　　　 　　   9  6  3　　　　　 7  4  1

4  5  6　　-->　   8  5  2　　 --> 8  5  2　　

7  8  9 　　 　7  4  1　　　　　  9  6  3
*/
public class 旋转图像 {
	int t = 0;
	public void rotate(int[][] matrix){
		int n = matrix.length;
		for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i; ++j) {
                t = matrix[i][j];
                matrix[i][j] = matrix[n - 1- j][n - 1 - i];
                matrix[n - 1- j][n - 1 - i] = t;
                
            }
        }
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < n; ++j) {
                t = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = t;
            }
        }
	}	
}
