package ��ָOffer;

import java.util.*;

/*����˼·��˳ʱ���ӡ���ǰ�Ȧ��ѭ����ӡ��һȦ�������л������У��ڴ�ӡ��ʱ������ĳһȦ��ֻ����һ�У�
 * Ҫ�жϴ������Ҵ�ӡ�ʹ��������ӡ��ʱ���Ƿ������ظ���ӡ��ͬ��ֻ����һ��ʱ��Ҫ�жϴ������´�ӡ�ʹ�
 * �����ϴ�ӡ��ʱ���Ƿ������ظ���ӡ�����
 * */

public class ˳ʱ���ӡ���� {
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
