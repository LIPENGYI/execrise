package leetcode;

import java.util.Arrays;

public class 保持城市的天际线 {
	public int maxIncreaseKeepingSkyline(int[][] grid){
		int[] skyLineT = getSkyLineTransversal(grid);
		int[] skyLineV = getSkyLineVertical(grid);
		int tLength = grid.length;
		int vLength = grid[0].length;
		int sum = 0;
		for(int i = 0;i<tLength;i++){
			for(int j = 0;j<vLength;j++){
				sum +=(getMin(skyLineT[j],skyLineV[i])-grid[i][j]);
			}
		}
		return sum;		
	}
	private int getMin(int i,int i1){	
		return i<i1? i:i1;
	}
	//得到没列的最大值
	public int[] getSkyLineTransversal(int[][] grid){
		int[] skyLineTransversal = new int[grid.length];
		int bound = grid.length;
		for(int i = 0;i<bound;i++){
			int boundT = grid[0].length;
			int temp[] = new int[boundT];
			for(int j = 0;j<boundT;j++){
				temp[j] = grid[j][i];
			}
			skyLineTransversal[i] = Arrays.stream(temp).max().getAsInt();
		}
		return skyLineTransversal;		
	}
	//得到每行的最大值
	public int[] getSkyLineVertical(int[][] grid){
		int[] skyLineVertical = new int[grid[0].length];
		int bound = grid.length;
		for(int i = 0;i<bound;i++){
			skyLineVertical[i] = Arrays.stream(grid[i]).max().getAsInt();
		}
		return skyLineVertical;		
	}
}
