package leetcode;
/*dp[i]��ʾi������ֲ�ֺ�����˻������Ĵ���dp[n].
��ʼ��:
dp[0] = 0 //�������ν
dp[1] = 1 //����1���������˷�
dp[2] = 1,
dp[i] = Max(dp[k] * dp[i - k], k * (i - k), dp[k] * (i - k), k * (dp[i - k])), kȡֵ��[1, i / 2]������
*/
public class ������� {
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
