package 剑指Offer;

import java.util.*;

/*解题思路：顺时针打印就是按圈数循环打印，一圈包含两行或者两列，在打印的时候会出现某一圈中只包含一行，
 * 要判断从左向右打印和从右向左打印的时候是否会出现重复打印，同样只包含一列时，要判断从上向下打印和从
 * 下向上打印的时候是否会出现重复打印的情况
 * */

public class 顺时针打印矩阵 {
	public ArrayList<Integer> printMatrix(int[][] matrix){
		ArrayList<Integer> list = new ArrayList<>();
		if(matrix == null)
			return list;
		int row = matrix.length;
		int col = matrix[0].length;
		if(row == 0||col == 0){
			return list;
		}
		int left = 0;
		int right = col -1;
		int top = 0;
		int bottom = row -1;
		while(left<right && top<=bottom){
			for(int i = left;i<= right;i++){
				list.add(matrix[top][i]);
			}
			for(int i = top+1;i<=bottom;i++){
				list.add(matrix[i][right]);
			}
			if(top != bottom){
				for(int i = right-1;i>=left;i--){
					list.add(matrix[bottom][i]);
				}
			}
			if(left!=right){
				for(int i = bottom-1;i>top+1;i--){
					list.add(matrix[i][left]);
				}
			}
			left++;
			right--;
			top++;
			bottom--;
		}
		return list;
		
	}
}
