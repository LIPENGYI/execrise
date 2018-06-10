package leetcode;

public class 买股票的最佳时机2 {
	public int maxProfit(int[] prices){
		int sum = 0;
		for(int i = 1;i<prices.length;i++){
			if(prices[i]>prices[i]){
				sum+=prices[i]-prices[i-1];
			}
		}
		return sum;
	}
}
