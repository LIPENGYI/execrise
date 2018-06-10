package leetcode;
/**
 * 463. 岛屿的周长
题目描述提示帮助提交记录社区讨论阅读解答
随机一题
给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。

示例 :

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

答案: 16
解释: 它的周长是下面图片中的 16 个黄色的边：
*/
public class 岛屿的最大周长 {
	public int islandPerimeter(int[][] grid){
		int permeter = 0;
		int n = grid.length;
		int m = grid[0].length;
		for(int i = 0;i<n;i++){
			for(int j = 0;j<m;j++){
				if(grid[i][j] == 1){
					if(i==0||grid[i-1][j]==0)permeter++;
					if(i==n-1||grid[i+1][j]==0)permeter++;
					if(j==0||grid[i][j-1]==0)permeter++;
					if(j==m-1||grid[i][j+1] == 0)permeter++;
				}
			}
		}
		return permeter;	
	}
}
