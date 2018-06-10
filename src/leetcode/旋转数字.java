package leetcode;

import java.util.HashMap;

public class Ğı×ªÊı×Ö {
	public int rotateDigits(int N){
		int count = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, 0);
		map.put(1, 1);
		map.put(8, 8);
		map.put(2, 5);
		map.put(5, 2);
		map.put(6, 9);
		map.put(9, 6);
		for(int i = 1;i<=N;i++){
			int number = i;
			int newNumber = 0;
			int m = 1;
			while(number>0){
				int digit = number%10;
				if(map.containsKey(digit)){
					newNumber = map.get(digit)*m+newNumber;
					number/=10;
					m*=10;
				}
				else{
					break;
				}
			}
			if(number == 0&&i!=newNumber){
				count++;
			}
		}
		return count;
		
	}
}
