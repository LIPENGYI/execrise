package leetcode;
/*dp[i]表示i这个数字拆分后的最大乘积，最后的答案是dp[n].
初始化:
dp[0] = 0 //这个无所谓
dp[1] = 1 //得是1，方便后面乘法
dp[2] = 1,
dp[i] = Max(dp[k] * dp[i - k], k * (i - k), dp[k] * (i - k), k * (dp[i - k])), k取值从[1, i / 2]闭区间
*/
public class 整数拆分 {
	public int intgerBreak(int n){
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		for(int i = 3;i<=n;i++){
			int max = Integer.MIN_VALUE;
			for(int k = 1;k<=i;k++){
				int tmpMax = Math.max(dp[k]*dp[i-k],k*(i-k));
				tmpMax = Math.max(tmpMax,dp[k]*(i-k));
				tmpMax = Math.max(tmpMax,dp[i-k]*k);
				max = Math.max(tmpMax, max);
			}
			dp[i] = max;
		}
		return dp[n];		
	}
}
