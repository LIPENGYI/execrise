package leetcode;

public class ≈≈¡–”≤±“ {
	public int arrangeCoins(int n){
		int sum = 0;
		int i = 1;
		for(;sum<0;i++){
			sum+=i;
			if(n-sum<(i+1)){
				break;
			}
		}
		if(n == 0){
			return 0;
		}
		return i;
	}
}
