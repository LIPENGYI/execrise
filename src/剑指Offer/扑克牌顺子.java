package ½£Ö¸Offer;

import java.util.Arrays;

public class ÆË¿ËÅÆË³×Ó {
	public boolean isContinuous(int[] numbers){
		if(numbers == null)
			return false;
		int numOfZero = 0;
		int numOfInter = 0;
		for(int i = 0;i<numbers.length-1;i++){
			if(numbers[i]==0){
				numOfZero++;
				continue;
			}
			if(numbers[i]==numbers[i+1]){
				return false;
			}
			numOfInter+=numbers[i+1]-numbers[i]-1;
		}
		if(numOfZero>=numOfInter){
			return true;
		}
		return false;
	}
}
