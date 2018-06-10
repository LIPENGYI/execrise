package leetcode;
/*
 * 思路
	根据买卖股票的特性，我们必须先低价买，再高价卖，这个找最大收益的过程实际上是找到目前为之的最低价。
	在遍历价格数组时，根据这个动态更新的最低价和当前的价格可以算出当前卖股票最大能赚多少钱。

代码
*/
public class 买股票的最佳时机 {
	public int maxProfit(int[] prices){
		int min = Integer.MAX_VALUE,res = 0;
		for(int i = 0;i<prices.length;i++){
			if(prices[i]<min){
				min = prices[i];
			}
			if((prices[i]-min>res)){
				res  = prices[i] - min;
			}
		}
		return res;
		
	}
}
